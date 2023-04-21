package com.gl.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTraversalDemo {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.put(5, 500);

        // 1. 通过 entrySet 遍历entry
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }

        // 2. 通过 keySet 遍历key, 再通过get(key)遍历value
        for(Integer key: map.keySet()) {
            System.out.println("key = " + key + ", value = " + map.get(key));
        }

        // 3. 利用迭代器遍历 set的迭代器 (一般工作中较少用到)
        // (1) 利用迭代器遍历 entrySet
        Iterator<Map.Entry<Integer, Integer>> entryIterator = map.entrySet().iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = entryIterator.next();
            System.out.println("EntrySet key = " + entry.getKey() + ", value = " + entry.getValue());
        }

        // (2) 利用迭代器遍历 keySet
        Iterator<Integer> keyIterator = map.keySet().iterator();
        while(keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println("KeySet key = " + key + ", value = " + map.get(key));
        }

        // 4. lambda 表达式遍历
        map.forEach((key, value) -> System.out.println("lambda key = " + key + ", value = " + value));


        map.entrySet().forEach(entry -> System.out.println("lambda entry key = " + entry.getKey() + ", value = " + entry.getValue()));

    }
}
