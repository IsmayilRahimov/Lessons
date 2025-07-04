package org.example.treeset;

import java.util.*;

public class Task {
    public static void main(String[] args) {

        Person per = new Person();
        per.setName("Eli");
        per.setAge(20);
        per.setSurname("Eliyev");
        Set<String> cagirmaq = new TreeSet<>();
        Set<String> cagirmaq2 = new HashSet<>();
        Set<String> cagirmaq3 = new LinkedHashSet<>();



        cagirmaq.add(per.getName());
        cagirmaq.add(per.getSurname());
        cagirmaq.add(per.getAge() + "");
        System.out.println(cagirmaq); //Tree set islenir

        cagirmaq2.add(per.getName());
        cagirmaq2.add(per.getSurname());
        cagirmaq2.add(per.getAge() + "");
        System.out.println(cagirmaq2); // HashSet islenir

        cagirmaq3.add(per.getName());
        cagirmaq3.add(per.getSurname());
        cagirmaq3.add(per.getAge() + "");
        System.out.println(cagirmaq3); // LinkedHashset islenir


    }
}
