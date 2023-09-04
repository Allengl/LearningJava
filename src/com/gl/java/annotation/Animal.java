package com.gl.java.annotation;

@Animals(name = "cat")
@Animals(name = "dog")
public class Animal {

    String type;

    public Animal() {}

    public Animal(String type) {
        this.type = type;
    }

    public void eat() {
        System.out.println("Animal eat");
    }
}
