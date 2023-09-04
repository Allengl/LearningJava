package com.gl.java.annotation;

public class Cat extends Animal{
    @Override
    @Deprecated
    public void eat() {
        super.eat();
        System.out.println("Cat eat");
    }
}
