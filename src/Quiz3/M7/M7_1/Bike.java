package Quiz3.M7.M7_1;

public class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " motosiklet işə düşdü...");
    }

    @Override
    void stop() {
        System.out.println(brand + " motosiklet dayandı...");
    }
}
