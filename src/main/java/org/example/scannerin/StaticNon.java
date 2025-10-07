package org.example.scannerin;

public class StaticNon {
    public static String add(String name) {
        return "Static" + name;
    }

    public String addA(String name, String surname) {
        return name + surname ;

    }


    public static void main(String[] args) {
        StaticNon.add("Anar");
        System.out.println(StaticNon.add("Anar"));

        StaticNon s1 = new StaticNon();
        System.out.println(s1.addA("anar " ,"qaasimov" ));
    }
}
