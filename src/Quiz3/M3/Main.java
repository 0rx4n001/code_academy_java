package Quiz3.M3;

public class Main {
    public static void main(String[] args) {
        M3_1_Car car1 = new M3_1_Car("Toyota", 180, 4);
        car1.displayInfo();

        M3_1_Car car2 = new M3_1_Car("Ford", 240, 5);
        car2.displayInfo();




        M3_2_Dogs dog1 = new M3_2_Dogs("Bobik", 5);

        dog1.sound();

        M3_2_Cats cat1 = new M3_2_Cats("Tom", 3);
        cat1.sound();
    }
}
