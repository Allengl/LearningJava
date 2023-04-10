package com.gl.java.basic.primitive;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int addResult = a + b + 33;
        int subtractResult = a - b;
        int multiResult = a * b;
        int divisionResult = b / a;
        int divisionResult2 = a / b;
        int remainderResult = b % a;

        System.out.println("a + b = " + addResult);
        System.out.println("a - b = " + subtractResult);
        System.out.println("a * b = " + multiResult);
        System.out.println("b / a = " + divisionResult);
        System.out.println("a / b = " + divisionResult2);
        System.out.println("b % a = " + remainderResult);
    }
}
