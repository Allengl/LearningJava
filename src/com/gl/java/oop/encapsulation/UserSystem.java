package com.gl.java.oop.encapsulation;

public class UserSystem {
    public static void main(String[] args) {
        User user = new User("Java", "123456");
        System.out.println(user);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.isLogin());
        user.login("Java", "123456");
        System.out.println(user.isLogin());

    }
}
