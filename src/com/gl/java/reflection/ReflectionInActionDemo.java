package com.gl.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionInActionDemo {

    public static void main(String[] args) {
        // 获取类名
        Class<Bird>  birdClass = Bird.class;
        System.out.println("Class name for birdClass: " + birdClass.getName());
        System.out.println("Class name for birdClass: " + birdClass.getSimpleName());

        // 获取包名
        Package birdPackage = birdClass.getPackage();
        System.out.println("Package name for birdClass: " + birdPackage.getName());

        // 获取构造器
        // 1.获取当前类所有的 public 构造器
        Constructor<?>[] constructors = birdClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor for birdClass: " + constructor);
        }

        // 2.获取当前类所有的构造器
        Constructor<?>[] getAllConstructors = birdClass.getDeclaredConstructors();
        for (Constructor<?> constructor : getAllConstructors) {
            System.out.println("AllConstructor for birdClass: " + constructor);
        }

        // 获取类的属性
        // 1.获取所有的自身public属性以及从父类继承的public属性
        Field[] fields = birdClass.getFields();
        for (Field field : fields) {
            System.out.println("Public Field: " + field);
            // 变量名
            System.out.println("Public Field name: " + field.getName());
            // 访问修饰符
            System.out.println("Public Field modifier: " + field.getModifiers());
            // 数据类型
            System.out.println("Public Field type: " + field.getType());

        }
        // 获取所有自身属性
        Field[] allFields = birdClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("All Field: " + field);
            // 变量名
            System.out.println("All Field name: " + field.getName());
            // 访问修饰符
            System.out.println("All Field modifier: " + field.getModifiers());
            // 数据类型
            System.out.println("All Field type: " + field.getType());
        }

    }
}
