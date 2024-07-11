package com.factory.classes;
import com.factory.classes.Square;
import com.factory.interfaces.Shape;
import com.factory.interfaces.ShapeFactory;

public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}