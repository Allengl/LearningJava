package com.gl.java.oop.abstraction;

public interface InterfaceB {
    void methodB();

    default void method() {
        System.out.println("method");
    }
}
