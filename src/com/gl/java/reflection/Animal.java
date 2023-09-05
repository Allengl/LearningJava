
package com.gl.java.reflection;

public class Animal {

    public String type;

    public Animal() {}

    public Animal(String type) {
        this.type = type;
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void doSomething() {
        System.out.println("Animal doSomething");
    }

}
