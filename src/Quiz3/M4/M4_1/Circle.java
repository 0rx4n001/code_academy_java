package Quiz3.M4.M4_1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {

        return Math.PI * radius * radius;
    }

}
