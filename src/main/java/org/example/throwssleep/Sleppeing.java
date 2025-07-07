package org.example.throwssleep;

public class Sleppeing {
    public static void main(String[] args)  {
        System.out.println("Buyurun:");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tesekkurler");

    }
}
