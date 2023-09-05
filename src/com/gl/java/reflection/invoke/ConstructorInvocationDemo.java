package com.gl.java.reflection.invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorInvocationDemo {
    public static void main(String[] args) {
        // 动态调用构造器初始化对象
        // 需求：创建一个 Person 对象
        Class<?> personClass = Person.class;
        try {
            // 获取对应的构造器
            Constructor constructor = personClass.getDeclaredConstructor(String.class,int.class);
            // 将访问权限设置为 true
            constructor.setAccessible(true);
            // 获取 newInstance初始化对象，注意参数需要和构造器传入参数对应
            Person person = (Person) constructor.newInstance("zhangsan", 2000);
            System.out.println(person);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
