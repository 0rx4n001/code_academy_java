package Quiz3.M7.M7_1;

public abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();
    abstract void stop();

    void displayBrand() {
        System.out.println("Marka: " + brand);
    }
}
