package com.gl.java.oop;

public class Customer {
    int id;

    String name;

    public static void printInformation(Customer customer) {
        System.out.println("Information: " + customer.id);
        System.out.println("Information: " + customer.name);

    };

    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.id); // 0
        System.out.println(customer.name); // null
        customer.id = 1;
        customer.name = "Java";
        System.out.println(customer.id); // 1
        System.out.println(customer.name); // Java
    }
}
