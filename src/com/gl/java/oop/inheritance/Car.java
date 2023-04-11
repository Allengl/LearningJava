package com.gl.java.oop.inheritance;

import java.util.Objects;

public class Car extends Vehicle {

    int seat;

    public Car(String name,
               String color,
               int speed,
               int model,
               int maxSpeed,
               int seat) {
        super(name, color, speed, model, maxSpeed);
        this.seat = seat;
    }

    public void printCarInformation() {
        System.out.println("Car seat " + this.seat);
    }

    @Override
    public void start(String name) {
        super.start(name);
        System.out.println("Car starting...");
    }

    @Override
    Car getInstance() {
        return new Car("Car", "Red", 100, 2019, 200, 4);
    }




    public static void main(String[] args) {
        Car car = new Car("Car", "Red", 100, 2019, 200, 4);
        car.printInformation();
        car.printCarInformation();
        car.name = "Car";
        car.color = "Red";

        boolean result = car instanceof Vehicle;
        System.out.println(result);

        boolean result2 = car instanceof Object;
        System.out.println(result2); // true


    }

    @Override
    public String toString() {
        return "Car{" +
                "seat=" + seat +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seat == car.seat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seat);
    }
}
