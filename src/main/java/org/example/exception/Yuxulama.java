package org.example.exception;

import java.lang.Exception;

public class Yuxulama {
    public static void main(String[] args)  {
        System.out.println("Program basladi:");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Proqram ise dusdu:");

    }
}
