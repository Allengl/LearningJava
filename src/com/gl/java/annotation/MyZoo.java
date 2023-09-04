package com.gl.java.annotation;

@Animals(name = "cat")
@Animals(name = "dog")
@Animals(name = "pig")
public class MyZoo {
    public static void main(String[] args) {
        Animals[] animals = MyZoo.class.getAnnotationsByType(Animals.class);
        for (Animals animal : animals) {
            System.out.println(animal.name());
        }
    }
}
