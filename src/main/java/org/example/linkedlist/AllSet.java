package org.example.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class AllSet {
    public static void main(String[] args) {


        Set<String> students = new HashSet<>(); // bu setde adlar elifba sirasina gore duzulur;

        students.add("Mike");
        students.add("Zaur");
        students.add("Alim");

        System.out.println(students+ "- Telebeler;" );

        students.remove("Alim");
        System.out.println(students+ "- Telebeler;" );

    }
}
