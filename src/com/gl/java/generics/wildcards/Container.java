package com.gl.java.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Container<T> {
    List<T> items;

    public Container() {
        items = new ArrayList<>();
    }

    public List<T> getItems() {
        return  items;
    }

   public void addItems(T item) {
        items.add(item);
    }

    // 无限制通配符 ? : List<?> list 表示list可以持有任意类型的元素

    public void printList(List<?> list) {
        // 不确定list里面具体是什么类型，所以不能进行写操作
        // list.add(new Object());
        // list.add(new Apple());
        // list.add(new Banana());
        for (Object o : list) {
            System.out.println(o);
        }
    }

    // 上界通配符 ? extends T : List<? extends T> list 表示list可以持有T类型的子类元素
    public void printList2(List<? extends Fruit> list) {
        // 不确定list里面具体是什么类型，所以不能进行写操作
        // list.add(new Object());
        // list.add(new Apple());
        // list.add(new Banana());
        for (Object o : list) {
            System.out.println(o);
        }

        Fruit element = list.get(0);
        System.out.println(element);


    }

    // 下界通配符 ? super T : List<? super T> list 表示list可以持有T类型的父类元素
    public void printList3(List<? super Fruit> list) {
        // 可以写入Fruit类型的元素
         list.add(new Fruit());
         list.add(new Apple());
         list.add(new Banana());
        for (Object o : list) {
            System.out.println(o);
        }

        // 不能读取元素,因为可能放的是Fruit的父类元素
        // Fruit element = list.get(0);
        // System.out.println(element);

    }

    public void doSomething() {
        Container<T> tContainer = new Container<>();
        tContainer.printList(tContainer.getItems());
    }

    public static void main(String[] args) {
        Container<Apple> appleContainer = new Container<>();
        List<Apple> apples = appleContainer.getItems();
        appleContainer.addItems(new Apple());
        appleContainer.printList(apples);

        Container<Banana> bananaContainer = new Container<>();
        List<Banana> bananas = bananaContainer.getItems();
        bananaContainer.addItems(new Banana());
        bananaContainer.printList(bananas);

        Container<Food> foodContainer = new Container<>();
        foodContainer.addItems(new Food());
        List<Food> foods = foodContainer.getItems();
        foodContainer.printList(foods);


        Container<?> fruitContainer = new Container<Apple>();
        fruitContainer = appleContainer;

    }
}
