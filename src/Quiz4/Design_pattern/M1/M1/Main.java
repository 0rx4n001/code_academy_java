package Quiz4.Design_pattern.M1.M1;

public class Main {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

        System.out.println("Are both instances same? " + (singleton1 == singleton2));
    }
}
