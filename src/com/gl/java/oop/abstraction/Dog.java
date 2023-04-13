package com.gl.java.oop.abstraction;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println(getAnimalName() + " is barking");
    }

    @Override
    void move() {
        System.out.println(getAnimalName() + " is moving");
    }

}
