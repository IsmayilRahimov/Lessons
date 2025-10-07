package org.example.intger;

public class IntegerNon {
    public static void main(String[] args) {
        int a = 5;
        Integer b = a;
        int x = b;
        System.out.println(b); // autobox
        System.out.println(x); // unbox
    }
}
