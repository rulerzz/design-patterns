package classes;
import classes.Square;
import interfaces.Shape;
import interfaces.ShapeFactory;

public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}