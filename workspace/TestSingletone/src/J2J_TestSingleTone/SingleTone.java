package J2J_TestSingleTone;

class Singleton {
    private static Singleton one;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(one==null) {
            one = new Singleton();
            System.out.println("SingleTone");
        }
        return one;
    }
}

public class SingleTone {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}