package CreationalPatterns;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        FactoryVarrior factoryVarrior;
        factoryVarrior = new VikingsFactory();
        factoryVarrior.createArcher();
        factoryVarrior.createArcher();

        factoryVarrior.createVarrior();
        factoryVarrior.createVarrior();
        factoryVarrior.createVarrior();


        factoryVarrior = new FrenchFactory();
        factoryVarrior.createVarrior();

        factoryVarrior.createArcher();
        factoryVarrior.createArcher();
        factoryVarrior.createArcher();
        factoryVarrior.createArcher();

        System.out.println("Vikings army:");
        VikingArcher.amountOfVikingArcher();
        VikingsVarrior.amountOfVikingVarrior();
        System.out.println("-------------------------------");
        System.out.println("French army:");
        FrenchArcher.amountOfFrenchArcher();
        FrenchVarrior.amountOfFrenchVarrior();
    }
}

interface Archer {
    void createArcher();
}

class VikingArcher implements Archer {
    public static int vikingArcher;

    public static void amountOfVikingArcher(){
        System.out.println("Total created "+vikingArcher + " viking archers");
    }

    public void createArcher() {
        vikingArcher++;
    }

    public VikingArcher() {
        createArcher();
        System.out.println("Created " + vikingArcher + " viking archers");
    }
}

class FrenchArcher implements Archer{

    public static int frenchArcher;

    public static void amountOfFrenchArcher(){
        System.out.println("Total created "+ frenchArcher + " french archers");
    }

    public void createArcher() {
        frenchArcher++;
    }

    public FrenchArcher() {
        createArcher();
        System.out.println("Created " + frenchArcher + " french archers");
    }
}


interface Varrior {
    void createVarrior();
}

class VikingsVarrior implements Varrior{

    public static int vikingVarrior;

    public static void amountOfVikingVarrior(){
        System.out.println("Total created "+ vikingVarrior + " viking varriors");
    }

    public void createVarrior() {
        vikingVarrior++;
    }

    public VikingsVarrior(){
        createVarrior();
        System.out.println("Created " + vikingVarrior + " viking varriors");
    }

}

class FrenchVarrior implements Varrior{

    public static int frenchVarrior;


    public static void amountOfFrenchVarrior(){
        System.out.println("Total created "+ frenchVarrior + " french varriors");
    }

    public void createVarrior() {
        frenchVarrior++;
    }

    public FrenchVarrior(){
        createVarrior();
        System.out.println("Created " + frenchVarrior + " french varriors");
    }
}

interface FactoryVarrior {
    Archer createArcher();
    Varrior createVarrior();
}

class VikingsFactory implements FactoryVarrior{
    @Override
    public Archer createArcher() {
        return new VikingArcher();
    }

    @Override
    public Varrior createVarrior() {
        return new VikingsVarrior();
    }
}

class FrenchFactory implements FactoryVarrior{
    @Override
    public Archer createArcher() {
        return new FrenchArcher();
    }

    @Override
    public Varrior createVarrior() {
        return new FrenchVarrior();
    }
}


