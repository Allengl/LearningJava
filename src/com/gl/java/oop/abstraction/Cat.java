package com.gl.java.oop.abstraction;

public class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println(getAnimalName() + " is meowing");
    }

    @Override
    void move() {
        System.out.println(getAnimalName() + "is moving");
    }

}
