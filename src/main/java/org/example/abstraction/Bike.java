package org.example.abstraction;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike ready");

    }

    @Override
    public void stop(String durmaq) {
        System.out.println("Stop");
    }

    @Override
     public void drive() {
        System.out.println("");
    }
}
