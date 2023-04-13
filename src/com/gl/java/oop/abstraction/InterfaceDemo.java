package com.gl.java.oop.abstraction;

//接口代表一种能力，而不是具体的实现
public interface InterfaceDemo {
    //接口中的方法默认是public abstract的
    void sound();

    void move();

    //接口中的方法默认是public static final的
    int a = 1;
}

