package Quiz4.Design_pattern.M1.M2;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
