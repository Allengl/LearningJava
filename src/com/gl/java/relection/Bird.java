package com.gl.java.relection;

import java.io.IOException;

/**
 * @author PC
 */
@Markable("main-bird")
public class Bird<T> extends Animal implements Flying, Comparable<Bird>{

    @Markable("age")
    private int age;

    public Bird() {
    }

    public Bird(String type,  int age) {
        super(type);
        this.age = age;
    }

    protected Bird(int age) {
        this.age = age;
    }

    public boolean canEat(String name) {
        return true;
    }

    @Markable("walk")
    public static void walk(int speed, String msg ) throws IOException {
        System.out.println("Bird walk" + speed + msg);

        if (speed > 100) {
            throw new IOException("speed is too fast");
        }
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public int compareTo(Bird o) {
        return this.age - o.age;
    }
}
