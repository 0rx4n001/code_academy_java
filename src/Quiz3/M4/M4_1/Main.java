package Quiz3.M4.M4_1;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        System.out.println("dairenin sahesi: "+circle1.calculateArea());

        Rectangel rectangle1 = new Rectangel(5,5);
        System.out.println("duzbucaqlinin sahesi: "+rectangle1.calculateArea());
    }
}
