package com.gl.java.arraylist;


import java.util.AbstractList;
import java.util.List;

/**
 * The generic ArrayList class.
 */

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    // field 属性
    /**
     * The data storage of array list.
     */
    private E[] elementData;

    /**
     * The size of the ArrayList (the number of elements it contains).
     */
    private int size;

    /**
     * The default initial capacity of an array list.
     */
    private int capacity;

    // constructor 构造方法
    public MyArrayList() {
        this.elementData = (E[]) new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        this.size = 0;
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        } else if (capacity < DEFAULT_CAPACITY) {
            this.elementData = (E[]) new Object[DEFAULT_CAPACITY];
            this.capacity = DEFAULT_CAPACITY;
            this.size = 0;
        } else {
            this.elementData = (E[]) new Object[capacity];
            this.capacity = capacity;
            this.size = 0;
        }
    }

    // method 方法

    /**
     * get the size of the array list.
     *
     * @return the size of the array list.
     */
    public int size() {
        return size;
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns true if this list contains the specified element.
     *
     * @param element the element to be checked.
     * @return true if this list contains the specified element.
     */
    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     *
     * @param element the element to be checked.
     * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     */
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * add an element to the end of the array list.
     *
     * @param element the element to be added.
     */
    public void add(E element) {
        // 如果数组已满，扩容
        resize(size == capacity ? capacity * 2 : capacity);
        elementData[size++] = element;
    }

    /**
     * add an element to specific index of the array list.
     *
     * @param index   the index of the element to be added.
     * @param element the element to be added.
     */
    public void add(int index, E element) {
        System.out.println("index" + index);
        rangeCheck(index, index > size);
        // 如果数组已满，扩容
        resize(size == capacity ? capacity * 2 : capacity);


        // 从后往前移动元素
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = element;
        size++;
    }

    /**
     * resize the array list.
     *
     * @param newCapacity the new capacity of the array list.
     */
    private void resize(int newCapacity) {
        // 1. Create new array
        E[] newArray = (E[]) new Object[newCapacity];

        // 2. Copy old array to new array
        // System.arraycopy(elementData, 0, newArray, 0, size);
        for (int i = 0; i < size; i++) {
            newArray[i] = elementData[i];
        }

        // 3. Assign new array to old array
        elementData = newArray;

        // 4. Update capacity
        this.capacity = newCapacity;
    }

    /**
     * remove an element from specific index of the array list.
     *
     * @param index the index of the element to be removed.
     * @return the element to be removed.
     */
    public E remove(int index) {
        rangeCheck(index, index >= size);
        // 1. Get value of index
        E oldVal = elementData[index];

        // 2. copy and shift
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        };
        // 3. update size
        elementData[--size].equals(0);
        return oldVal;
    }

    /**
     * remove the first occurrence of the specified element from this list, if it is present.
     *
     * @param element the element to be removed.
     * @return the element to be removed.
     */
    public boolean removeByElement(E element) {
        // 遍历数组，找到第一个等于element的元素，删除
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * get the element at the specified position in this list.
     *
     * @param index the index of the element of get.
     * @return the element of get.
     */
    public E get(int index) {
        // 0: check index
        rangeCheck(index, index >= size);
        // 1: get value
        return (E) elementData[index];
    }

    private void rangeCheck(int index, boolean b) {
        if (index < 0 || b) {
            throw new RuntimeException(
                    String.format("index %d is out of bounds", index));
        }
    }

    /**
     * set the element at the specified position in this list.
     *
     * @param index   the index of the element to be set.
     * @param element the element to be set.
     * @return the old element to be set.
     */
    public E set(int index, E element) {
        E oldVal = elementData[index];
        elementData[index] = element;
        return (E) oldVal;
    }


    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        MyArrayList list2 = new MyArrayList(100);

        for (int i = 0; i < 20; i++) {
            list2.add(i);
            System.out.println("The size of list2 is " + list2.size());
        }
        list2.add(1, 100);
    // contains 100
        System.out.println("list2 contains 100 " + list2.contains(100));

        System.out.println("list is empty" + list2.isEmpty());
        // display the list2

        System.out.println("The size of list2 is " + list2.size());

        System.out.println("Element at index 5 is " + list2.get(5));
        list2.remove(1);
        list2.add(1, 100);
        System.out.println("Element at index 5 is " + list2);

    }
}
