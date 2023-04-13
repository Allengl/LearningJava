package com.gl.java.oop.abstraction;

public class DefualtMethodDemo implements InterfaceA, InterfaceB {
    @Override
    public void method() {
        InterfaceA.super.method();
        InterfaceB.super.method();
    }

    @Override
    public void methodB() {
    }
    @Override
    public void methodA() {
    }

    public static void main(String[] args) {
        DefualtMethodDemo defualtMethodDemo = new DefualtMethodDemo();
        defualtMethodDemo.method();
    }
}
