package org.example.abstraction;

public abstract class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike ready");

    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
     public void drive() {
        System.out.println("");
    }
}
