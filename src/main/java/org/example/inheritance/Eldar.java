package org.example.inheritance;

public class Eldar extends Insan{
    void work() {
        System.out.println("Eldar  iwleyir ");
    }
    void sleep(String yataq) {
        System.out.println("Eldar" + yataq + "-da yatir");
    }
    void eat(String food) {
        System.out.println("Eldar  yeyir " + food);
    }

    public static void main(String[] args) {
        Eldar eldar0 = new Eldar();
        eldar0.work();
        eldar0.sleep("yataq");
        eldar0.eat("Et");

    }
}
