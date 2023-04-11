package com.gl.java.oop.porymorpnism;

public class ShapeAreaCaculator {
    public static void main(String[] args) {
        Shape Square = new Square(10);
        Shape Rectangle = new Rectangle(10, 20);
        Shape Circle = new Circle(10);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Circle(10);

        // Calculate the area of each shape
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }
}
