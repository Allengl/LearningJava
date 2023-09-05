package com.gl.java.reflection.invoke;

import java.lang.reflect.Field;

public class FieldAccessInvocationDemo {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        // 需求：获取 age 属性的值,并修改为 20

        try {
            Field ageField = person.getClass().getDeclaredField("age");
            // 将访问权限设置为 true
            ageField.setAccessible(true);
            // set属性
            ageField.set(person, 20);

            Field nameField = person.getClass().getDeclaredField("name");
            nameField.set(person, "zhangsan");
            System.out.println(person);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
