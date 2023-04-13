package com.gl.java.oop.abstraction;

public interface Flyable {
    void fly();

    void sleep();

    default void showSpeed() {
        System.out.println("Speed is 100km/h");
    }

    static void showInfo() {
        System.out.println("This is a Flyable interface");
    }
}
interface Eatable {
    void eat();
}
