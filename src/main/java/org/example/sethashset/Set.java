package org.example.sethashset;

public class Set {
    public static void main(String[] args) {
        java.util.Set<String> adlar = new java.util.HashSet<>();
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
