package com.gl.java.arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

    public class User {
        String name;
        int age;
    }

    public static void main(String[] args) {
        // 如果构造声明ArrayList

        // 1. 不带类型的
        ArrayList list = new ArrayList();

        // 2. 带类型的 <>里面全部要引用类型 (基本类型要转化成包装类)
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Hello");
        stringArrayList.add(111 + "");

        // 3. 推荐写法
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>(100);
        List<User> userList = new ArrayList<>();

        Collection<Integer> c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        List<Integer> integerList2 = new ArrayList<Integer>(c);

        List<Integer> integerList3 = new ArrayList<Integer>();
        for (Integer integer : c) {
            integerList3.add(integer);
        }

        // size() 获取元素个数
        System.out.println("size = " + integerList3.size()); // 3

        // isEmpty() 判断是否为空
        if(integerList3.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }

        // cpmtains() 判断是否包含某个元素
        System.out.println("contains = " + integerList3.contains(1)); // true

        // indexOf() 获取某个元素的索引
        System.out.println("indexOf = " + integerList3.indexOf(1)); // 0

        System.out.println("indexOf = " + integerList3.indexOf(100)); // -1

        // lastIndexOf() 获取某个元素最后一次出现的索引
        System.out.println("lastIndexOf = " + integerList3.lastIndexOf(1)); // 0

        System.out.println("lastIndexOf = " + integerList3.lastIndexOf(100)); // -1

        // toArray() 转化成数组
        Object[] objects = integerList3.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

        // toArray(T[] a) 转化成数组
        Integer[] integers = integerList3.toArray(new Integer[0]);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        //get() 获取某个索引的元素
        System.out.println("get = " + integerList3.get(0)); // 1

        for (int i = 0; i < integerList3.size(); i++) {
            System.out.println(integerList3.get(i));
        }

        //set() 设置某个索引的元素
        integerList3.set(0, 100); // 1
        System.out.println("set = " + integerList3.get(0)); // 100

        //add() 添加元素
        integerList3.add(1); // 1  加到最后

        integerList3.add(1, 200); // 1
        System.out.println("add = " + integerList3.get(1)); // 200 加到最后其它后面的元素往后移


        //remove() 删除元素
        int toRemove = integerList3.remove(1);
        System.out.println("remove = " + toRemove); // 200
        boolean remove = integerList3.remove((Integer) 1); //删除第一个发现的对象
        System.out.println("remove = " + remove); // true

        //clear() 清空
        integerList3.clear();

        //

    }


}
