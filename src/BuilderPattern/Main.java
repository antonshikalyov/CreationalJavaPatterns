package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Bmw b = new Bmw();
        b.bmw();
        System.out.println("-------------------");
        Mercedes m = new Mercedes();
        m.mercedes();

        System.out.println("-------------------");

        CarDirector carDirector = new CarDirector();
        CarBuilder carBuilder = new CarBuilder();

        carDirector.createCar(carBuilder);
    }
}

interface Car {
    CarBuilder SetModel(String model);
    CarBuilder SetEngine(String engine);
    CarBuilder SetColor(String color);
    CarBuilder SetMaxSpeed(int speed);
}

class CarBuilder implements Car{
    String model = "DEFAULT cheap car!";
    String engine = "DEFAULT engine";
    String color = "DEFAULT color yellow";
    int speed = 160;

    public CarBuilder SetModel(String model) {
        this.model = model;
        System.out.println(model);
        return this;
    }

    public CarBuilder SetEngine(String engine) {
        this.engine = engine;
        System.out.println(engine);
        return this;
    }

    public CarBuilder SetColor(String color) {
        this.color = color;
        System.out.println(color);
        return this;
    }

    public CarBuilder SetMaxSpeed(int speed) {
        this.speed = speed;
        System.out.println(speed);
        return this;
    }

    public void carBuilder(){
        SetModel(model);
        SetEngine(engine);
        SetColor(color);
        SetMaxSpeed(speed);
    }
}

class Bmw extends CarBuilder{

    @Override
    public CarBuilder SetModel(String model) {
        model = "M3 GTR";
        return super.SetModel(model);
    }

    @Override
    public CarBuilder SetEngine(String engine) {
        engine = "Sport engine";
        return super.SetEngine(engine);
    }

    @Override
    public CarBuilder SetMaxSpeed(int speed) {
        speed = 260;
        return super.SetMaxSpeed(speed);
    }

    @Override
    public CarBuilder SetColor(String color) {
        return super.SetColor(color);
    }

    public void bmw(){
        SetModel(model);
        SetEngine(engine);
        SetMaxSpeed(speed);
        SetColor(color);
    }
}

class Mercedes extends CarBuilder{
    @Override
    public CarBuilder SetModel(String model) {
        model = "Merin";
        return super.SetModel(model);
    }

    @Override
    public CarBuilder SetEngine(String engine) {
        engine = "Sport engine Mercedess";
        return super.SetEngine(engine);
    }

    @Override
    public CarBuilder SetMaxSpeed(int speed) {
        speed = 230;
        return super.SetMaxSpeed(speed);
    }

    @Override
    public CarBuilder SetColor(String color) {
        color = "red";
        return super.SetColor(color);
    }

    public void mercedes(){
        SetModel(model);
        SetEngine(engine);
        SetMaxSpeed(speed);
        SetColor(color);
    }
}

class CarDirector {
    public void createCar(Car car){
        car.SetEngine("V12");
        car
                .SetEngine("V6")
                .SetMaxSpeed(300)
                .SetModel("e36");
    }
}
