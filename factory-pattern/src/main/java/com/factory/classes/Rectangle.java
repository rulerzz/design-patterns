package com.factory.classes;
import com.factory.interfaces.Shape; 

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}