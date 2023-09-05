package com.gl.java.reflection;


import com.gl.java.annotation.Animal;

import java.util.Random;

public class ObjectCreationDemo {
    public static Object getInstance() {
        Random random = new Random();
        int seed = random.nextInt(3); // 0, 1, 2
        String className = "";
        switch (seed) {
            case 0:
                className = "java.lang.String";
                break;
            case 1:
                className = "com.gl.java.annotation.Animal";
                break;
            case 2:
                className = "java.util.ArrayList";
                break;
            default:
                System.out.println("No action");
        }
        try {
            Class<?> clazz = Class.forName(className);
            return clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        // 动态创建对象
        // 1.通过Class对象的newInstance()方法来创建Class对象对应类的实例
        Class<Animal> clazz = Animal.class;
        try {
            // 1. 要有无参数构造器
            // 2. 构造器的访问权限要足够
            Animal animal = clazz.newInstance();
            animal.eat();
            System.out.println(animal);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            Object instance = getInstance();
            System.out.println(instance);
        }


        // 2.通过Constructor对象的newInstance()方法来创建Class对象对应类的实例
        // 3.通过Constructor对象的newInstance()方法来创建Class对象对应类的实例
        // 4.通过Object类的clone()方法来创建一个对象的副本
        // 5.通过反序列化的方式来创建对象
    }
}
