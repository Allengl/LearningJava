package com.gl.java.generics;

public class MyGenericStringImpl implements MyGenericI<String, String> {

    @Override
    public String getElement(String param) {
        return null;
    }

    public <T> void print(T t) {
        System.out.println(t);
    }

    public <T> T printAndReturn(String t, T config) {
        System.out.println(t);
        return config;
    }

    public <B, A> B doSomething(A something) {
        System.out.println("doSomething");
        return null;
    }

    public static void main(String[] args) {
        MyGenericI<String, String> myGenericI = new MyGenericStringImpl();
        MyGenericStringImpl myGenericStringImpl = new MyGenericStringImpl();
        myGenericI.getElement("Hello");
        myGenericI.getElement("World");
        myGenericStringImpl.doSomething("Hello");
    }
}

