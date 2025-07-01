package org.example.encapsulatin;

public class Cagirmaq {
    public static void main(String[] args) {


        Mawin mawin = new Mawin();


        mawin.setBrand("BMW");
        mawin.setSpeed(200);
        mawin.setYear(2020);
        System.out.println(mawin.getBrand() + " Brend");
        if (mawin.getSpeed() < 200 && mawin.getSpeed() > 0) {
            System.out.println("Mawin suretle gedir:");

        } else {
            System.out.println("Mawin suretli degildir:");
        }
        System.out.println(mawin.getYear());
    }
}


