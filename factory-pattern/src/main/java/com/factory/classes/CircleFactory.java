package classes;
import classes.Circle;
import interfaces.Shape;
import interfaces.ShapeFactory;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}