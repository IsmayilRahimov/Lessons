package org.example.consturctorsleson;

public class Car {
    String brand;
    int year;
    int speed;

    Car(String brand, int year, int speed){ // construktor qururuq:
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    Car(String brand, int year){ // burdada yeni olacaq mawinin konstruktorunu qururuq:
        this.brand = brand;
        this.year = year;
    }
    public Car(String brand){
        System.out.println( "Konstruktor quruldu");
    }
}
class useCar{
    public static void main(String[] args) {
        Car car = new Car("BMW", 2020, 260);
        System.out.println(car.brand + " " + car.year + " " + car.speed);
        car = new Car("Volvo", 2010);
        System.out.println(car.brand + " " + car.year);

    }
}
