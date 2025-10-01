package org.example.singl;

public class SinglPat {

    private static SinglPat instance;

    private SinglPat() {

    }

    public static SinglPat getInstance() {
        if (instance == null) {
            instance = new SinglPat();
        }
        return instance;
    }

    public void show() {
        System.out.println("My Singl Pattern ready");
    }
}
