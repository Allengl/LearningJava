package com.gl.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionInMethodDemo {
    public static void main(String[] args) {
        Class<Bird> birdClass = Bird.class;

        // 获取该类以及其父类的所有 public 方法
        Method[] methods = birdClass.getMethods();
        for(Method method : methods) {
            System.out.println("Public method: " + method);
            System.out.println("Public method name: " + method.getName());
            System.out.println("Public method modifier: " + method.getModifiers());
            System.out.println("Public method return type: " + method.getReturnType());
            System.out.println("Public method parameter types: " + method.getParameterTypes());
            System.out.println("Public method exception types: " + method.getExceptionTypes());
            // 获取方法上的注解
            Annotation[] annotations = method.getAnnotations();
            for(Annotation annotation : annotations) {
                System.out.println("Public method annotation: " + annotation);
                System.out.println("Public method annotation type: " + annotation.annotationType());
                if(annotation instanceof Markable) {
                    Markable markable = (Markable) annotation;
                    System.out.println("Public method annotation value: " + markable.value());
                }
            }
            // 获取该类的所有方法
            Method[] allMethods = birdClass.getDeclaredMethods();
            System.out.println("All method: " + allMethods);
        }

    }
}
