package com.gl.java.reflection.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvokeDemo {
    public static void main(String[] args) {
        // 调用 public 无参无返回值构造方法
        // 1. 获取 Class 对象
        MyClass myClass = new MyClass(10);
        Class<?> clazz = myClass.getClass();

        // 2. 获取目标方法的 Method 对象
        try {
            Method doSomethingMethod = clazz.getMethod("doSomething");
            // 3. 调用目标方法
            Object doSomethingResult = doSomethingMethod.invoke(myClass);
            System.out.println(doSomethingResult);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // 调用 public 有参有返回值构造方法
        try {
            Method sumMethod = clazz.getMethod("sum", int.class, String.class);
            // 3. 调用目标方法, 参数对应的是方法的参数
            // Expected: sumResult = 40
            Object sumResult = sumMethod.invoke(myClass, 10, "20");
            System.out.println(sumResult);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // 调用private有参数有返回值方法
        // 1. 获取 Class 对象
        MyClass myClass2 = new MyClass(10);
        try {
            // 2. 获取目标方法的 Method 对象
            Method sum1Method = clazz.getDeclaredMethod("sum1", String.class, String.class);
            // 3. 调用目标方法, 参数对应的是方法的参数, 但是由于是 private 方法, 所以需要设置访问权限
            // Expected: sum1Result = 3020
            sum1Method.setAccessible(true);
            Object sum1Result = sum1Method.invoke(myClass2, "3000", "10");
            System.out.println(sum1Result);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // 调用 static 静态方法
        // 1. 获取 Class 对象
        try {
            // 2. 获取目标方法的 Method 对象
            Method staticMethod = clazz.getMethod("staticMethod", String.class);
            // 3. 调用目标方法, 参数对应的是方法的参数, 但是由于是 private 方法, 所以需要设置访问权限
            staticMethod.setAccessible(true);
            // 把 null 传给 invoke 方法, 表示调用的是静态方法
            Object staticMethodResult = staticMethod.invoke(null, "3000");
            System.out.println(staticMethodResult);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
