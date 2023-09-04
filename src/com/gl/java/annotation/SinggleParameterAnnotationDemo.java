package com.gl.java.annotation;

@SinggleParameterAnnotation
public class SinggleParameterAnnotationDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }

}
