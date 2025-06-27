package org.example.inheritance;

// bu clasda overloading olunub
public class Ismayil extends Insan {


    void work() {
        System.out.println("Ismayil  iwleyir ");
    }

    void sleep(String yataq) {
        System.out.println("Ismayil  " + yataq + "-da yatir");
    }

    void eat(String food, String fruit) {
        System.out.println("Ismayil  yeyir " + food + "" + fruit);
    }

    @Override
    void breath(String hava) {
        System.out.println("Ismayil " + hava + "-ile cetin nefes alir");
    }

    @Override
    void breath(String hava, String ozon) {
        System.out.println("Ismayil nefes alir: " + hava + " ile:" + " Nefes ala bilmir " + ozon + " ile:");
    }

    public static void main(String[] args) {
        Ismayil ismayil0 = new Ismayil();
        ismayil0.work();
        ismayil0.sleep("yataq");
        ismayil0.eat("Et", "banan"); // oveloading olunub ve ismayil terevez yemir:
        ismayil0.eat("et", "banan");
        ismayil0.breath("oksigen");
        ismayil0.breath("oksigen", "qaz");
    }

}
