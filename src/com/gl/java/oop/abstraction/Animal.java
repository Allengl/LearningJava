package com.gl.java.oop.abstraction;

public abstract class Animal {

    public abstract void sound();

    abstract void move();

    public void eat() {
        System.out.println("Animal is eating");
    }

    public String getAnimalName() {
        return getClass().getName();
    }

    public static void main(String[] args) {

    }
}
