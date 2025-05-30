package org.example.opclas;

public class UsingCarClas {
    public static void main(String[] args) {
        Car car2 = new Car();
        car2.brand = " Bmw ";
        car2.year = 2015;
        car2.color = " Black ";
        car2.speed = 200;
        car2.start();
        car2.il();
        car2.reng();
        car2.stop();

        Car car3 = new Car();
        car3.brand = " Lada ";
        car3.year = 2018;
        car3.color = " White ";
        car3.speed = 180;
        car3.stop();
        car3.reng();
        car3.il();
        car3.run();
    }
}
