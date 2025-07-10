package org.example.arrayslinkedlist;

import java.util.LinkedList;

public class PersonLinked {
    public static void main(String[] args) {
        LinkedList<String> insanlar = new LinkedList<>();

        insanlar.add("Anar");
        insanlar.add("Musa");
        insanlar.add("Zaur");

        System.out.println("Ilk element adi : " + insanlar.getFirst());

        for (String insan : insanlar) {
            System.out.println(insan);
        }
    }
}
