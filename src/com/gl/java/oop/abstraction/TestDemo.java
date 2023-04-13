package com.gl.java.oop.abstraction;

public class TestDemo {
    public void collect(Bird bird) {
        System.out.println(bird);
    }

    public void showInfo(Flyable flyable) {
       flyable.fly();
    }

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        Bird bird = new Bird("Bird") {
            @Override
            public void fly() {
                System.out.println("Bird is flying");
            }
        };

        String name = "JAVA";
        Flyable flyableThing = new Bird(name) {
            @Override
            public void fly() {
                System.out.println("Flyable is flying");
            }
        };
        testDemo.showInfo(flyableThing);
    }
}
