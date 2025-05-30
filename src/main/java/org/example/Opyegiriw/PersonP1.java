package org.example.Opyegiriw;

import java.util.Scanner;

public class PersonP1 {
    String name;


    void setName(String name) {
        this.name = name;
        System.out.println("Adi teyin et:");

    }

    void run() {
        System.out.println("Sizin teyin etdiyiniz ad: " + name);
    }
}
class cagiriram {
    public static void main(String[] args) {


        PersonP1 p = new PersonP1();
        p.setName("Anar");
        p.run();
        p.equals(p.name);

    }
}
