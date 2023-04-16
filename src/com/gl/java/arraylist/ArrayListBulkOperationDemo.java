package com.gl.java.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBulkOperationDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        List<String> list2 = new ArrayList<>();
        list2.add("World");
        list2.add("!");

        // addAll() 将另一个集合的所有元素添加到当前集合中
        // 加到末尾
        list.addAll(list2);
        System.out.println(list); // [Hello, World, !]

        // 加到index位置, 原来index位置的元素及其后面的元素向后移动
        list.addAll(1, list2);
        System.out.println(list); // [Hello, World, !, World, !]

        // containsAll() 判断当前集合是否包含另一个集合的所有元素
        // 在 AbstractCollection 中实现，并不是在 ArrayList 中实现
        System.out.println(list.containsAll(list2)); // true

        // removeAll() 删除当前集合中包含另一个集合的所有元素
        list.removeAll(list2);
        System.out.println(list); // [Hello]

        // retainAll() 删除当前集合中不包含另一个集合的所有元素
        list.retainAll(list2); // [Hello]
        System.out.println(list); // []

    }
}
