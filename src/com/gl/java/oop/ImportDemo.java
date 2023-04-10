package com.gl.java.oop;

import com.gl.java.basic.operator.BitOperatorDemo;
import static com.gl.java.oop.Car.welcome;

import java.util.ArrayList;
import java.util.List;

public class ImportDemo {
    public static void main(String[] args) {
        Car car = new Car();

        com.gl.java.oop.Car car2 = new com.gl.java.oop.Car();
        BitOperatorDemo bitOperatorDemo = new BitOperatorDemo();

        Integer integer = new Integer(10);

        List list = new ArrayList();

        welcome();
    }
}
