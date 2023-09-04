package com.gl.java.relection;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionInAnnotationDemo {
    public static void main(String[] args) {

        // 获取类的注解
        Class<Bird> birdClass = Bird.class;
        Markable markable = birdClass.getAnnotation(Markable.class);
        System.out.println("Markable annotation: " + markable);
        System.out.println("Markable value: " + markable.value());
        System.out.println("Markable annotation type: " + markable.annotationType());

        // 获取属性上的注解
        try {
            Field field = birdClass.getDeclaredField("age");
            Markable fieldMarkable = field.getAnnotation(Markable.class);
            System.out.println("Field annotation: " + fieldMarkable);
            System.out.println("Field value: " + fieldMarkable.value());
            System.out.println("Field annotation type: " + fieldMarkable.annotationType());
        } catch (NoSuchFieldException e) {
           throw new RuntimeException(e);
        }

        // 获取 target 上的注解
        Class<Target> targetClass = Target.class;
        Annotation[] annotations = targetClass.getAnnotations();
        for(Annotation annotation : annotations) {
            System.out.println("Target annotation: " + annotation);
            System.out.println("Target annotation type: " + annotation.annotationType());
            if(annotation instanceof Target){
                Target target = (Target) annotation;
                System.out.println("Target annotation value: " + Arrays.toString(target.value()));
            }
        }
    }
}
