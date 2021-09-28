package CreationalPatterns;

public class SingeltonPattern {
    public static void main(String[] args) {
        Singelton arr[] = new Singelton[10];
        for (int i = 5; i <=5 ; i++) {
            arr[i] = Singelton.getSingelton();
        }
        System.out.println(Singelton.amount);
    }
}

class Singelton{
    private static Singelton singelton;
    public static int amount = 0;
    private Singelton(){
        amount++;
    }

    public  static Singelton getSingelton() {
        if (singelton == null) {
            singelton = new Singelton();
        }
        return singelton;
    }
}
