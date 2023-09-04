package com.gl.java.annotation;


/**
 * @author PC
 */
// @SuppressWarnings({"deprecation","unsed"}
public class SuppressWarningsAnnotationDemo {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }

    // unused
    @SuppressWarnings("unused")
    public void test() {
        int a = 10;
    }
}
