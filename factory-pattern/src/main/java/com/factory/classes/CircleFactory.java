package com.factory.classes;
import com.factory.classes.Circle;
import com.factory.interfaces.Shape;
import com.factory.interfaces.ShapeFactory;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}