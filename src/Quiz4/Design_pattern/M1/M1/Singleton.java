package Quiz4.Design_pattern.M1.M1;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

    }


    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Pattern in action!");
    }
}
