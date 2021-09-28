package CreationalPatterns;

public class FactoryPattern {
    public static void main(String[] args) {
        CarFactory cf = new BmwFactory();
        Car car = cf.carFactory();
        car.SetEngine();
        car.SetWheels();
        cf.NewCar();
    }
}

 interface Car {
    void SetEngine();
    void SetWheels();
}

class Bmw implements Car{
    public void SetEngine() {
        System.out.println("Set engine for BMW!");
    }

    public void SetWheels() {
        System.out.println("Set wheels for BMW!");
    }
}

class Mercedes implements Car {
    public void SetEngine() {
        System.out.println("Set engine for MERCEDES!");
    }

    public void SetWheels() {
        System.out.println("Set wheels for MERCEDES!");
    }
}

interface CarFactory {
    Car carFactory();
    void NewCar();
}

class BmwFactory implements CarFactory{

    public Car carFactory() {
        return new Bmw();
    }

    public void NewCar() {
        System.out.println("New BMW!");
    }
}

class MercedesFactory implements CarFactory{
    @Override
    public Car carFactory() {
        return new Mercedes();
    }

    @Override
    public void NewCar() {
        System.out.println("New MERCEDES!");
    }
}
