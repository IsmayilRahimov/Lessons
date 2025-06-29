package org.example.abstractionex;

public  class Ismayil extends Feelings  {

    @Override
    void loving(String name) {
        System.out.println(name + " ismayil");
    }


    public void eating(String meal) {
        System.out.println("Et yeyir");
    }
    public static void main(String[] args) {
        Ismayil ismayil = new Ismayil();
        ismayil.loving("Ragimov");
        ismayil.eating("Et");
    }

}
