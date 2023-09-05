package com.gl.java.reflection.invoke;

public class Person {
    public String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        System.out.println("");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
