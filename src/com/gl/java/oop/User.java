package com.gl.java.oop;

public class User {

    int id;

    String name;

    void sayHello() {
        System.out.println("Hello, " + this.name);
    }

    void login() {
        System.out.println("Login");
    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.id); // 0
        System.out.println(user.name); // null
        user.id = 1;
        user.name = "Java";
        System.out.println(user.id); // 1
        System.out.println(user.name); // Java
        user.sayHello(); // Hello, Java
        user.login(); // Login

        User user2 = new User();
        System.out.println(user2.id); // 0
        System.out.println(user2.name); // null
        user2.id = 2;
        user2.name = "Python";
        System.out.println(user2.id); // 2
        System.out.println(user2.name); // Python
        user2.sayHello(); // Hello, Python
        user2.login(); // Login

        User use3 =  user2;
        System.out.println(use3.id); // 2
        System.out.println(use3.name); // Python

        use3.id = 3;
        use3.name = "C++";
        System.out.println(use3.id); // 3
        System.out.println(use3.name); // C++
        System.out.println(user2.id); // 3
        System.out.println(user2.name); // C++


    }
}
