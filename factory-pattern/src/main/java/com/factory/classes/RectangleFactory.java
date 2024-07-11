package com.factory.classes;
import com.factory.classes.Rectangle;
import com.factory.interfaces.Shape;
import com.factory.interfaces.ShapeFactory;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}