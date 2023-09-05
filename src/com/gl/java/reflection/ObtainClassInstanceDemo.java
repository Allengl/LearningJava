package com.gl.java.reflection;

import com.gl.java.annotation.Cat;

public class ObtainClassInstanceDemo {
    public static void main(String[] args) {
        // 1.通过类名.class
        Class<Cat> catClass = Cat.class;
        System.out.println(catClass);

        // 2.通过对象.getClass()
        Cat cat = new Cat();
        Class<? extends Cat> aClass = cat.getClass();
        System.out.println(aClass);

        // 3.通过Class.forName("全类名")
        try {
            Class<?> aClass1 = Class.forName("com.gl.java.reflection.Cat");
            System.out.println(aClass1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 4.基本内置类型的包装类都有一个Type属性
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

        // 5.获取父类类型
        Class<? super Cat> superclass = catClass.getSuperclass();
        System.out.println(superclass);

        // 6.获取接口
        Class<?>[] interfaces = catClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        // 7.获取包名
        Package aPackage = catClass.getPackage();
        System.out.println(aPackage);

        // 8.获取全类名
        String name = catClass.getName();
        System.out.println(name);

        // 9.获取类名
        String simpleName = catClass.getSimpleName();
        System.out.println(simpleName);
    }
}
