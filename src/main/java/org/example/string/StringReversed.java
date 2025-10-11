package org.example.string;

public class StringReversed {
    public static void main(String[] args) {

        String text = "Galatasaray";
        String club = new StringBuilder(text).reverse().toString();
        System.out.println(club);

        String pois = "Fenerbaxca";
        String bos = "";

        for (int i = pois.length() - 1; i >= 0; i--) {
            bos += pois.charAt(i);
        }
        System.out.println(bos);
    }
}