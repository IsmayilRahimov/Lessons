package org.example.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Anar");
        set.add("Azad");
        set.add("Bahar");
        set.add("Bahram");
        set.add("Cefer");
        set.add("Samir");
        System.out.println(set);

        set.add("Camal");
        System.out.println(set);


    }
}
