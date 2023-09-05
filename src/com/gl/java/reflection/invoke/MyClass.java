package com.gl.java.reflection.invoke;

public class MyClass {

    private int count;

    public MyClass() {
    }

    public MyClass(int count) {
        this.count = count;
    }

    public void doSomething() {
        System.out.println("MyClass doSomething");
    }

    public int sum(int num1, String strNum) {
        return num1 + Integer.parseInt(strNum) + this.count;
    }

    private String sum1(String strNum1, String strNum2) {
        return "" + Integer.parseInt(strNum1) + Integer.parseInt(strNum2) + this.count;
    }

    private static String staticMethod(String str) {
        return str + "World!";
    }
}
