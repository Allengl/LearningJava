package com.gl.java.oop.abstraction;

public interface InterfaceA {

    void methodA();

    default void method() {
        System.out.println("method");
    }
}
