package org.example.abstraction;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop(String durmaq) {
        System.out.println("Stop");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop("durmaq");
        car.drive();
        Bike bike = new Bike();
        bike.start();
        bike.stop("durmaq");
        bike.drive();


    }

}
