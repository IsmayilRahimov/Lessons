package org.example.finalclass;

public class FinalPr {

    public final void run() {
        System.out.println("This final method ;");
    }

    public static void main(String[] args) {
        FinalPr s1 = new FinalPr();
        s1.run();
    }
}
