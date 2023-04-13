package com.gl.java.oop.abstraction;

public class Zoo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();
        cat.move();
        cat.eat();

        Animal dog = new Dog();
        dog.sound();
        dog.move();
        dog.eat();
    }
}
