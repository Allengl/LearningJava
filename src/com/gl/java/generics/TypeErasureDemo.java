package com.gl.java.generics;

import java.util.ArrayList;

public class TypeErasureDemo {



    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        // 类型擦除 Type Erasure -> 改变javac编译器，不需要改字节码，也不需要该虚拟机

        // ArrayList<String> -> ArrayList
        ArrayList<String> stringArrayList = new ArrayList<>();
        // ArrayList<Integer> -> ArrayList   row type
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        arrayList = stringArrayList;
        arrayList = integerArrayList;
        arrayList.add("Hello");
        arrayList.add(111);
    }
}
