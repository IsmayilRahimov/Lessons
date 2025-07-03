package org.example.linkedlist;

import java.util.Set;

public class TreeSet {

    public static void main(String[] args) {
        Set<Integer> num = new java.util.TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        System.out.println(num.size()); //indeks cemi 5 di
        System.out.println(num.contains(10)); //true
        System.out.println(num.contains(100)); //false
        System.out.println(num.remove(10));
        num.toArray();
        System.out.println(num.toString());
        System.out.println(num);

    }
}
