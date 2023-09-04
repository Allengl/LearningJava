package com.gl.java.annotation;

@FunctionalInterface
public interface CustomizeFunctionalInterface {

    void method1();

    default void method2(){
        System.out.println("method2");
    }
}
