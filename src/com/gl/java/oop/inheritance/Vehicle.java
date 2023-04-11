package com.gl.java.oop.inheritance;

public class Vehicle {
    String name;

    String color;

    private int speed;

    private int model;

    private int maxSpeed;

    public Vehicle(String name, String color, int speed, int model, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }


    void printInformation() {
        System.out.println("Information: " + this.name);
        System.out.println("Information: " + this.color);
        System.out.println("Information: " + this.speed);
        System.out.println("Information: " + this.model);
        System.out.println("Information: " + this.maxSpeed);
    }

    public void start(String name) {
        System.out.println("Starting...");
    }

    Vehicle getInstance() {
        return new Vehicle("Vehicle", "Red", 100, 2019, 200);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Vehicle", "Red", 100, 2019, 200);
        vehicle.printInformation();

        boolean result = vehicle instanceof Car;
        System.out.println(result);
    }


    public int getSpeed() {
        return speed;
    }

    public int getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
