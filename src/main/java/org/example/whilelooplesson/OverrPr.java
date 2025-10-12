package org.example.whilelooplesson;

public class OverrPr extends OverrP2 {
    @Override
    void sound(String book) {
        System.out.println("Child clas" + book);
    }

    public static void main(String[] args) {
        OverrPr s1 = new OverrPr();
        s1.sound(" :Dostoyevski");
    }
}
