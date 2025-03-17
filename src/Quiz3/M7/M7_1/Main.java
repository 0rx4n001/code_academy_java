package Quiz3.M7.M7_1;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Yamaha");

        car.displayBrand();
        car.start();
        car.stop();

        bike.displayBrand();
        bike.start();
        bike.stop();
    }
}
