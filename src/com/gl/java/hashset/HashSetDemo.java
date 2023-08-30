package com.gl.java.hashset;

import java.util.*;

/**
 * @author PC
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // 构造一个空的HashSet对象
        Set<String> set = new HashSet<>();

        Collection<Integer> c = new ArrayList<>();
        Collections.addAll(c, 1, 1,2, 3, 4, 5, 6, 7, 8, 9);
        Set<Integer> integerSet = new HashSet<>(c);
        System.out.println(integerSet);

        // size/isEmpty

        // Expected: 9
        System.out.println(integerSet.size());
        System.out.println(integerSet.isEmpty());



    }
}
