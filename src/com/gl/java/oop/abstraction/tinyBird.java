package com.gl.java.oop.abstraction;

public class tinyBird extends Bird implements Flyable, Eatable {

    public tinyBird(String name) {
        super(name);
    }

    @Override
        public void fly() {
            System.out.println("Tiny bird is flying");
        }

        @Override
        public void eat() {
            System.out.println("Tiny bird is eating");
        }

        @Override
        public void sleep() {
            System.out.println("Tiny bird is sleeping");
        }

        public static void main(String[] args) {
            tinyBird tb = new tinyBird("Tiny Bird");
            tb.fly();
            tb.eat();
            tb.sleep();
        }

}
