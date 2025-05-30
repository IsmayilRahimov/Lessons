package org.example.Opyegiriw;

public class CarB {
    String brand;

    void brend() {
        this.brand = brand;

    }

    void mawin() {
        System.out.println("Mawinin brendi: " + brand);
    }

    String name;
    int year;

    void mawininadi() {
        System.out.println();
        this.name = name;
        System.out.println("Mawinin adi :" + name);

    }

    void mawininili() {
        this.year = year;
        System.out.println("Mawinin ili :" + year);

    }
}

class Caruser {
    public static void main(String[] args) {
        CarB cars = new CarB();
        cars.name = "Bmw";
        cars.year = 2010;
        cars.brand = "e60";
        cars.mawin();
        cars.brend();
        cars.mawininadi();
        cars.mawininili();



    }
}
