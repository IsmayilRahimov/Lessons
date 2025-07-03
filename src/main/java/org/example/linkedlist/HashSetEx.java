package org.example.linkedlist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx {

    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("qasim");
        s.add("Jamal");
        s.add("Ali");
        s.add("Elvin");
        System.out.println(s);

        Set<String> s2 = new LinkedHashSet<>();
        s2.add("qasim");
        s2.add("Jamal");
        s2.add("Ali");
        s2.add("Elvin");
        System.out.println(s2);

        Set<String> s3 = new TreeSet<>();
        s3.add("qasim");
        s3.add("Jamal");
        s3.add("Ali");
        s3.add("Elvin");
        System.out.println(s3);


    }
}
