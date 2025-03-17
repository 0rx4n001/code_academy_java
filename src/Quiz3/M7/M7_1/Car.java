package Quiz3.M7.M7_1;

public class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " maşını işə düşdü...");
    }

    @Override
    void stop() {
        System.out.println(brand + " maşını dayandı...");
    }
}
