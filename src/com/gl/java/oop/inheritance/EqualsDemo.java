package com.gl.java.oop.inheritance;

public class EqualsDemo {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Black", 100, 2019, 200, 5);
        Car car2 = new Car("BMW", "Black", 100, 2019, 200, 5);
        System.out.println(car1 == car2); // false
        System.out.println(car1.equals(car2)); // false
        System.out.println(car1.hashCode()); // 2018699554
        System.out.println(car2.hashCode()); // 1311053135
    }
}
