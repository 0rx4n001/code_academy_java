package Quiz3.M7.M7_2;

public abstract class Shape {

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Sahə: " + calculateArea());
    }
}
