package org.example.linkedlist;

import java.util.*;

public class LinkedEx {

    public static void main(String[] args) {

        List<String> seherler = new LinkedList<>();
        seherler.add("Baki");
        seherler.add("Moskva");
        seherler.add("Kazan");
        seherler.add("Tashkent");
        seherler.add("Samarqand");
        seherler.add("Sibir");

        System.out.println(seherler);
        seherler.remove("Samarqand");
        System.out.println(seherler);

        seherler.set(0, "Kazan");
        System.out.println(seherler);
        seherler.add(4, "Baki");
        System.out.println(seherler);
        Set<String> insanlar = new HashSet<>();
        insanlar.add("Murat");
        insanlar.add("Elvin");
        insanlar.add("Qasimov");
        insanlar.add("Elam");
        insanlar.add("Musa");
        System.out.println(insanlar);

        for (String sehir : seherler) {
            System.out.println(sehir);
        }
        System.out.println(seherler.contains("Kazan"));

        Set<String> sehirSet = new LinkedHashSet<>();
        sehirSet.add("Baki");
        sehirSet.add("Moskva");
        sehirSet.add("Kazan");
        sehirSet.add("Tashkent");
        sehirSet.add("Samarqand");
        sehirSet.add("Sibir");
        System.out.println(sehirSet);

    }
}
