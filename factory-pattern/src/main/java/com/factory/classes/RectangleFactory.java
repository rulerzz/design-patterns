package classes;
import classes.Rectangle;
import interfaces.Shape;
import interfaces.ShapeFactory;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}