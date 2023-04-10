package com.gl.java.oop;

public class StaticDemo {
    int id = 1;

    static String name = "StaticDemo";

    // 静态代码块用于类的初始化
    static {
        name = "StaticDemo";
        System.out.println("Static block");
        printInformation("Hello World");
        String[] args = new String[10];
        main(args);
    }

    public StaticDemo(int id) {
        this.id = id;
    };

    static void printInformation(String msg) {
        System.out.println("Information: " + msg);
    };
    void printObjInformation(String msg) {
        System.out.println("Information: " + msg);
        printInformation(msg);
    };

    public static void main(String[] args) {
        StaticDemo demo1 = new StaticDemo(1);
        System.out.println(demo1.id);
        demo1.printObjInformation("Hello World");
        StaticDemo demo2 = new StaticDemo(2);
        System.out.println(demo2.id);
        System.out.println(StaticDemo.name);
        StaticDemo.printInformation("Hello World");
    }

}
