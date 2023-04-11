package com.gl.java.oop.inheritance;

public class SuvCar extends Car {
     public SuvCar(String name, String color, int speed, int model, int maxSpeed, int seat) {
          super(name, color, speed, model, maxSpeed, seat);
     }

     public void drive() {
         super.printInformation();
     }
}
