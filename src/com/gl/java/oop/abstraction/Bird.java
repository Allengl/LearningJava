package com.gl.java.oop.abstraction;

public class Bird implements Flyable {

    public String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {

    }

    @Override
    public void sleep() {

    }

    public static void main(String[] args) {
        Bird bird = new Bird("大鸟");
        bird.showSpeed();
        Flyable.showInfo();
    }

//    @Override
//    public void showInfo() {
//        Flyable.super.showInfo();
//    }
}
