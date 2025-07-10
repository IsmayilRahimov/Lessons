package org.example.sethashset;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<String> adlar = new java.util.TreeSet<>();
        adlar.add("Arzuman");
        adlar.add("Faiq");
        adlar.add("Agali");
        adlar.add("Mansur");
        System.out.println(adlar);
        System.out.println("Adlarin sayisi: " + adlar.size());
        System.out.println("Adlarin icinde Faiq var mi? " + adlar.contains("Faiq"));
        for (String ad : adlar) {
            System.out.println(ad);
        }
    }


}



