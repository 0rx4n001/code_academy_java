package Quiz3.M4.M4_1;

public class Rectangel extends Shape {

    private double width , height;


    public Rectangel(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calculateArea() {
        return width * height;
    }


}
