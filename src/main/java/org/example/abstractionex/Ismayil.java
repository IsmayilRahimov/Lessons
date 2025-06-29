package org.example.abstractionex;

public abstract class Ismayil extends Feelings implements Behaviours {

    @Override
    void loving(String name) {
        System.out.println(name + " ismayil");
    }

    @Override
    public void eating(String meal) {
        System.out.println("Et yeyir");
    }

    public static void main(String[] args) {
        Ismayil ismayil;
        ismayil = new Ismayil() {
            @Override
            public void eating(String meal, int quantity) {

            }

            @Override
            public void eating() {
                System.out.println("Etiyir");

            }
        };
        ismayil.loving("Ragimov");
        ismayil.eating("Et");
    }

    public abstract void eating();
}
