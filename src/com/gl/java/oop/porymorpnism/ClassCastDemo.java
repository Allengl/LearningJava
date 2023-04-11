package com.gl.java.oop.porymorpnism;

public class ClassCastDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // 向上转型
        Shape rectangle = new Rectangle(10, 20);
        Shape square = new Square(10);
        Shape circle = new Circle(10);


        // 向下转型
        Rectangle rectangle1 = (Rectangle) rectangle;
        Square square1 = (Square) square;
        Circle circle1 = (Circle) circle;

        // 向下转型失败
//         Square square2 = (Square) rectangle;
//         Circle circle2 = (Circle) rectangle;
//         Rectangle rectangle2 = (Rectangle) circle;
        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(square);
        System.out.println(square1);
        System.out.println(circle);
        System.out.println(circle1);


    }
}
