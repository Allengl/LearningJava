package com.gl.java.generics;

public class MyGenericArrayList<T>{
    private T[] array;
    private int size;

    public MyGenericArrayList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public void add(T element) {
        array[size] = element;
        size++;
    }

    public T get(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        MyGenericArrayList<String> myGenericArrayList = new MyGenericArrayList<>();
        myGenericArrayList.add("Hello");
        myGenericArrayList.add("World");
        System.out.println(myGenericArrayList.get(0));
        System.out.println(myGenericArrayList.get(1));
    }
}
