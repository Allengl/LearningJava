package com.gl.java.hashmap;

import java.util.Map;

public class MyHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getLoadFactor() {
        return loadFactor;
    }

    public void setLoadFactor(float loadFactor) {
        this.loadFactor = loadFactor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    static class Node<K, V> {
        K key;

        V value;

        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }


    // 底层数组初始化的容量

    private int capacity;

    // 装填因子

    private float loadFactor;

    // Hashmap中元素个数

    private int size;


    // 采用数组 + 链表作为底层数据结构

    private Node<K, V>[] table;

    public MyHashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int capacity) {
        this(capacity, DEFAULT_LOAD_FACTOR);
    }


    public MyHashMap(int capacity, float loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.table = new Node[capacity];
    }

    // Methods - put/get/remove

    /**
     * put key-value pair into the map
     *
     * @param key   key
     * @param value value
     * @return null if add new entry, otherwise return the old value
     */
    public V put(K key, V value) {
        // 扩容
        if (size >= capacity * loadFactor) {
            resize(capacity * 2);
        }

        int index = hash(key);
        Node<K, V> node = table[index];

        if (node == null) {
            // 哈希桶为空，直接插入
            table[index] = new Node<>(key, value, null);
            size++;
            return null;
        }
        // 哈希桶不为空，两种情况
        // 1. key存在，更新value
        // 2. key不存在，插入链表尾部
        while (node != null) {
            if (node.key == key) {
                // key相同，更新value
                V oldValue = node.getValue();
                node.setValue(value);
                return oldValue;
            }
            if (node.getNext() == null) {
                // key不同，插入链表尾部
                node.setNext(new Node<>(key, value, null));
                size++;
            }
            node = node.getNext();
        }
        return null;
    }

    private int hash(K key) {
        return Math.max(0, key.hashCode() % capacity);
    }

    private void resize(int newCapacity) {
        System.out.println("resize: " + newCapacity);
        Node<K, V>[] newTable = new Node[newCapacity];
        this.capacity = newCapacity;
        // rehashing冲哈希 遍历老哈希表哈希桶
        for (Node<K,V> node : table) {
            while (node != null) {
                // 1. 计算key的hash值
                // 2. 根据hash值找到对应的哈希桶
                // 3. 遍历哈希桶，找到key对应的节点
                int index = hash(node.getKey());
                Node<K, V> head = newTable[index];
                Node<K,V> newNode = new Node<>(node.getKey(), node.getValue(), null);
                if (head == null) {
                    // 哈希桶为空，直接插入
                    newTable[index] = newNode;
                } else {
                    // 哈希桶不为空，插入链表尾部
                    while (head.getNext() != null) {
                        head = head.getNext();
                    }
                    head.setNext(newNode);
                }
                node = node.getNext();
            }
        }
        // 最好把老的哈希表置为null，让GC回收
        // 将新的哈希表赋值给老的哈希表
        this.table = newTable;
    }

    /**
     * get value by key
     *
     * @param key key
     * @return null if not found, otherwise return the value
     */
    public V get(K key) {
        // 1. 计算key的hash值
        // 2. 根据hash值找到对应的哈希桶
        // 3. 遍历哈希桶，找到key对应的节点
        int index = hash(key);
        Node<K, V> node = table[index];
        while (node != null) {
            if (node.getKey() == key) {
                return node.getValue();
            }
            node = node.getNext();
        }
        return null;
    }

    /**
     * remove the entry by key
     *
     * @param key key
     * @return null if not found, otherwise return the value
     */
    public V remove(K key) {
       // 1. 计算key的hash值
         // 2. 根据hash值找到对应的哈希桶
            // 3. 遍历哈希桶，找到key对应的节点
                // 4. 删除节点
        int index = hash(key);
        Node<K, V> node = table[index];

        if (node == null) {
            return null;
        }

        if (node.getKey() == key) {
            // 1. 保存被删除node的next
            // 2. 将被删除node的next赋值给table[index]
            V oldValue = node.getValue();
            Node<K, V> next = node.getNext();
            node.setNext(null);
            table[index] = next;
            size--;
            return oldValue;
        }

        // 针对于非头节点的删除
        Node<K,V> prevNode = node;
        Node<K,V> currNode = node.getNext();

        while (currNode != null) {
            if (currNode.getKey() == key) {
                V oldValue = currNode.getValue();
                prevNode.setNext(currNode.getNext());
                currNode.setNext(null);
                size--;
                return oldValue;
            }
            prevNode = currNode;
            currNode = currNode.getNext();
        }
        return null;

    }

    // size
    public int size() {
        return size;
    }

    // isEmpty
    public boolean isEmpty() {
        return size == 0;
    }


    public static void main(String[] args) {
        MyHashMap<Integer, String> hashMap = new MyHashMap<>();
        MyHashMap<String, String> hashMap2 = new MyHashMap<>(20, 0.8f);

        System.out.println("Size of my hash map" + hashMap.size());
        hashMap.put(10, "hello");
        hashMap.put(6, "apple");
        hashMap.put(22, "cat");
        System.out.println("Size of my hash map" + hashMap.size());

       for(Node<Integer, String> node : hashMap.table) {
           System.out.println(node);
       }

        System.out.println(hashMap.get(6)); // apple
        System.out.println(hashMap.get(22)); // cat
        System.out.println(hashMap.get(10)); // hello
        System.out.println(hashMap.get(100)); // null

        hashMap.put(54, "dog");

        System.out.println("The key remove from 6" + hashMap.remove(6)); // apple

        System.out.println("The key remove form 10" + hashMap.remove(10)); // hello

        System.out.println("The key remove form 100" + hashMap.remove(100)); // null

        // Expected output: 22 -> cat -> 54 -> dog -> null
        for(Node<Integer, String> node : hashMap.table) {
            System.out.println(node);
        }
        // Expected: 2
        System.out.println("Size of my hash map" + hashMap.size());
        System.out.println("Is my hash map empty? " + hashMap.isEmpty());

        MyHashMap<String, String> hashMap3 = new MyHashMap<>(5, 0.8f);
        MyHashMap<String, String> intHm = new MyHashMap<>(5, 0.8f);
        intHm.put("1", "1");
        intHm.put("2", "2");
        intHm.put("3", "3");
        intHm.put("4", "4");
        intHm.put("5", "5");
        intHm.put("6", "6");
        intHm.put("7", "7");
        intHm.put("8", "8");
        intHm.put("9", "9");
        intHm.put("10", "10");
    }


}
