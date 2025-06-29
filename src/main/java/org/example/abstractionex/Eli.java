package org.example.abstractionex;

public class Eli extends Feelings {
    @Override
    void loving(String name) {
        System.out.println(name + " eli");
    }

    public void eating(){
        System.out.println("Eli yeyir");
    }
    public static void main(String[] args) {
        Eli eli = new Eli();
        eli.loving("Qasimov");
        eli.eating();
    }
}
