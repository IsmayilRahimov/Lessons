package org.example.constructors;

public class Car {
    String brand;
    int year;
    int speed;
    static int salary;
    static String name;

    public static void Car(String brand, int year) {
        System.out.println(brand + " " + year);
    }
    public void getCar(String brand){
        System.out.println(brand);
    }

}

class UseCar {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Car("BMW", 2020);
        car.getCar("Volvo");


        car.brand = "BMW";
        car.year = 2020;
        car.speed = 260;
        System.out.println(car.brand + " " + car.year + " " + car.speed);
        Car.salary = 10000;
        Car.name = "Volvo";
        System.out.println(Car.name + ": " + Car.salary);
    }
}
