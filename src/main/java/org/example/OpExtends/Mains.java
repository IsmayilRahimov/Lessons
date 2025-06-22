package org.example.OpExtends;

public class Mains {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Zebr zebra = new Zebr();

        dog.name = "Coni";
        dog.age = 5;
        cat.name = "Toplan";
        cat.age = 3;
        zebra.age = 10;
        zebra.name = "Zebra";

        dog.aged();
        dog.barkings();
        dog.eating();
        cat.meowing();
        cat.aged();
        cat.eating();
        zebra.runings();
        zebra.eating();
        zebra.aged();

    }
}
