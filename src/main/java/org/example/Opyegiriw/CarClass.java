package org.example.Opyegiriw;

public class CarClass {
    String brand;
    String name;
    int year;
    int speed;

    CarClass getCar(int year) {
        CarClass carbmw = new CarClass();
        carbmw.brand = "Bmw";
        carbmw.speed = 260;
        carbmw.year = 2020;
        carbmw.name = "Mawinin sahibi Ismayil:";
        System.out.println(carbmw.brand);
        System.out.println(carbmw.year);
        System.out.println(carbmw.name);
        System.out.println(carbmw.speed);
        return carbmw;

    }

}
