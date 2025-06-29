package org.example.abstractionex;

public class Anar implements Behaviours {
    @Override
    public void eating(String meal) {
        System.out.println("Anar yeyir");
    }
    @Override
    public void eating(String meal, int quantity) {
        System.out.println("Anar yeyir");
    }
}
