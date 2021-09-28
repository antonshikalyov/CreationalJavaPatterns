package CreationalPatterns;

public class PrototypePattern {
    public static void main(String[] args) {
        Prototype original = new Prototype("Su50",2500);
        System.out.println(original);

        Prototype copy = (Prototype) original.copy();
        System.out.println(copy);

        FactoryCopies factoryCopies = new FactoryCopies(original);
        Prototype f30 = factoryCopies.createCopy();
        System.out.println(f30);

        factoryCopies.setNewPrototip(new Prototype("F32",2000));
        Prototype f31 = factoryCopies.createCopy();
        System.out.println(f31);
    }
}

interface Copyable {
    Object copy();
}


class Prototype implements Copyable{
    String Plain;
    int MaxSpeed;

    public Prototype(String Plain, int MaxSpeed){
        this.Plain = Plain;
        this.MaxSpeed = MaxSpeed;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "Plain='" + Plain + '\'' +
                ", MaxSpeed=" + MaxSpeed +
                '}';
    }

    @Override
    public Object copy() {
        Prototype prototype = new Prototype(Plain, MaxSpeed);
        return prototype;
    }
}


class FactoryCopies {
    Prototype prototype;

    public FactoryCopies(Prototype prototype1){
        setNewPrototip(prototype1);
    }

    public void setNewPrototip(Prototype prototype1) {
        this.prototype = prototype1;
    }

    Prototype createCopy(){
        return (Prototype)prototype.copy();
    }
}

