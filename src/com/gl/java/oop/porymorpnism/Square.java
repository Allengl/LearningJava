package com.gl.java.oop.porymorpnism;

public class Square extends Shape{
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * width;
    }
}