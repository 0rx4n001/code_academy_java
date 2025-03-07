package Quiz3.M3;

class M3_1_Car extends M3_1_Vehicle {
    private int numberOfDoors;

    public M3_1_Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Qapı sayı: " + numberOfDoors + "\n");
    }
}
