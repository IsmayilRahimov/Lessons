package org.example.apolymorphism;

public class Elgun extends Insan{
    public void eat() {
        System.out.println("elgun yeyir");

    }
    public void work() {
        System.out.println("elgun iwleyir");

    }
    public void sleep(String kravat) {
        System.out.println("elgun  yatir" + kravat);

    }
    public void drink() {
        System.out.println("elgun icki icir");

    }

    public static void main(String[] args) {
        Elgun elgun = new Elgun();
        elgun.eat();
        elgun.work();
        elgun.sleep("Mebel kravat");
        elgun.drink();
    }
}
