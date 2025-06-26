package org.example.OpExtendsLesson;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.move();
        car.stop();
        car.speed=100;
        System.out.println("car speed " + car.speed);
        Vehicle vehicle = new Vehicle();
        vehicle.move();
        vehicle.stop();
        vehicle.speed=100;
        System.out.println("vehicle speed " + vehicle.speed);


    }
}