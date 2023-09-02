package com.gl.java.exceptions;

public class ExceptionBestpracticeDemo {

    public static void method1() {
        try {
            int[] nums = new int[5];
            int number = nums[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            throw new CustomizeUnCheckedException("ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (CustomizeUnCheckedException e) {
            System.out.println("CustomizeUnCheckedException");
        }
    }
}
