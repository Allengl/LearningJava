package com.gl.java.sort;

import com.sun.org.apache.xml.internal.utils.StringComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }


    public static void main(String[] args) {
        // Comparator接口 -> 参数传入
        List<String> stringList = new ArrayList<>();
        stringList.add("z");
        stringList.add("b");
        stringList.add("a");
        stringList.add("d");
        stringList.add("c");



        // 1. 写Comparator接口的实现类
        Comparator<String> comparator = new StringComparator();
        stringList.sort(comparator); //等价于 Collections.sort(stringList, comparator);


        // 按字母排序
        stringList.forEach(System.out::println);


        // 2. 匿名内部类
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String s : stringList) {
            System.out.println(s);
        }

        // 3. Lambda表达式
        stringList.sort((o1, o2) -> o2.compareTo(o1));


        for (String s : stringList) {
            System.out.println(s);
        }

    }
}
