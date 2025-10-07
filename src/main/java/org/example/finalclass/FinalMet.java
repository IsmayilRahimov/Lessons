package org.example.finalclass;

public final class FinalMet {
    public String show(String name) {
        return name;
    }

    public static void main(String[] args) {
        FinalMet s1 = new FinalMet();
        s1.show("A");
        System.out.println(s1);
    }
}




