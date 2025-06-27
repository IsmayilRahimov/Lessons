package org.example.inheritance;

public class Insan {
    void eat(String food, String fruit, String vegetable) {
        System.out.println("Insan  yeyir " + food + fruit + vegetable);
    }

    void eat(String food, String fruit) {
        System.out.println("Insan  yeyir " + food + fruit);
    }

    void work() {
        System.out.println("Insan  iwleyir ");
    }

    void sleep(String yataq) {
        System.out.println("Insan" + yataq + "-da yatir");
    }

    void breath(String hava) {
        System.out.println("Insan" + hava + "-ile nefes alir");

    }
    void breath(String hava, String ozon) {
        System.out.println("Insan nefes alir");
    }
}
