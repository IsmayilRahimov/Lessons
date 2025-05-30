package org.example.opclas;

public class Person {
    String name;

    void setName(String name) {
        this.name = name;

    }

    void cagirmag() {
        System.out.println(name + " gelir ");
    }
}

class Ayxan {
    public static void main(String[] args) {
        Person ayxan = new Person();
        ayxan.setName("Ayxan");
        ayxan.cagirmag();
        Person s = new Person();
        s.setName("Eli");
        s.cagirmag();

    }
}
