package org.example.string;

public class JavaString {
    public static void main(String[] args) {
        String word = "Salam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed);

        String soz = "Ismayil";
        String ters = "";

        for (int i = soz.length() - 1; i >= 0; i--) {
            ters += soz.charAt(i);
        }
        System.out.println(ters);

        String text = "Kolumbo";
        String eks = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            eks += text.charAt(i);
        }
        System.out.println(eks);


        String object = "Lombok";
        String coun = new StringBuilder(object).reverse().toString();
        System.out.println(coun);


    }
}
