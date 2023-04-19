package com.gl.java.hashmap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        // 如何构造一个HashMap
        Map<String, Double> map = new HashMap<>();

        // size/isEmpty
        System.out.println("map.size() = " + map.size());
        System.out.println("map.isEmpty() = " + map.isEmpty());

        // put/putAll/putIfAbsent

        // 1.put: 把键值对放入hash map中 (包含增和改)
        Double oldValue = map.put("张三", 99.9); // null -> add
        System.out.println("oldValue = " + oldValue);
        System.out.println("map.get(\"张三\") = " + map.get("张三")); // 99.9
        oldValue = map.put("李四", 88.8);
        System.out.println("oldValue = " + oldValue); // null -> add
        System.out.println("map.get(\"李四\") = " + map.get("李四")); // 88.8
        //  覆盖原来的键值对，除非你明确地知道要去更新键值对的时候，可以用重复的key去put
        oldValue = map.put("张三", 77.7);
        System.out.println("map.get(\"张三\") = " + oldValue); // 99.9 -> update
        System.out.println("map.get(\"张三\") = " + map.get("张三")); // 77.7
        // 特例
        oldValue = map.put(null, null); // null -> add
        System.out.println("oldValue = " + oldValue); // null
        System.out.println("map.get(null) = " + map.get(null)); // null
        oldValue = map.put(null, null); // null -> update
        System.out.println("oldValue = " + oldValue); // null

        // 2.putAll: 把另一个map中的所有键值对都放入当前map中

        // 3.putIfAbsent: 如果当前map中不存在key，才把key-value放入map中
        Double v = map.putIfAbsent("张三", 66.6); // 77.7 -> update
        System.out.println("v of 张三 " + v);
        System.out.println("map.get(\"张三\") = " + map.get("张三")); // 77.7
        v = map.putIfAbsent("王五", 55.5); // null -> add
        System.out.println("v of 王五 " + v);
        System.out.println("map.get(\"王五\") = " + map.get("王五")); // 55.5

        // 3. putAll 不建议使用
        System.out.println("before map.get(\"赵六\") = " + map.get("赵六")); // null
        System.out.println("before map.get(\"孙七\") = " + map.get("孙七")); // null
        System.out.println("before map.get(\"张三\") = " + map.get("张三")); // 77.7
        Map<String, Double> newMap = new HashMap<>();
        newMap.put("赵六", 66.6);
        newMap.put("孙七", 77.7);
        newMap.put("张三", 88.8);
        map.putAll(newMap);
        System.out.println("map.get(\"赵六\") = " + map.get("赵六")); // 66.6
        System.out.println("map.get(\"孙七\") = " + map.get("孙七")); // 77.7
        System.out.println("map.get(\"张三\") = " + map.get("张三")); // 88.8

        // get/getOrDefault

        // 1.get: (1)对于传入的key, 存在value, 返回value (2)对于传入的key, 不存在value, 返回null
        Double value = map.get("张三");
        System.out.println("value of 张三 " + value); // 88.8
        Double value2 = map.get("钱八");
        System.out.println("value of 钱八 " + value2); // null

        // 特例
        map.put("null", null);
        System.out.println("map.get(\"null\") = " + map.get("null")); // null

        // 2.getOrDefault: (1)对于传入的key, 存在value, 返回value (2)对于传入的key, 不存在value, 返回默认值
        Double value3 = map.getOrDefault("张三", 99.9);
        System.out.println("value3 of 张三 " + value3); // 88.8
        Double value4 = map.getOrDefault("钱八", 99.9);
        System.out.println("value4 of 钱八 " + value4); // 99.9
    }

}
