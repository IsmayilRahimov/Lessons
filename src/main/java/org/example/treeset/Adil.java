package org.example.treeset;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Adil {
    public static void main(String[] args) {
        PrivAdil adil = new PrivAdil();
        adil.setName("Adill");
        adil.setAge(20);
        adil.setSurname("Eliyev");
        System.out.println(adil);

        List<String> cagiradili = new LinkedList<>();

        cagiradili.add(adil.getName());
        System.out.println(cagiradili);



    }
}
