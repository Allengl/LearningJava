package com.gl.java.oop;

public class Outer {
    private int number;

    private void outerMethod() {
        System.out.println("outerMethod");
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void useInnerMethod() {
        Inner inner = new Inner();
        inner.innerMethod();
    }

    class Inner {
        public void innerMethod() {
            System.out.println("innerMethod");
            System.out.println(number);
            outerMethod();
            staticMethod();
        }
    }

    static class InnerStatic {
        public void innerMethod() {
            System.out.println("innerMethod");
            staticMethod();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.useInnerMethod();
        Outer.Inner inner = outer.new Inner();
        inner.innerMethod();
        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        innerStatic.innerMethod();
    }
}
