package org.example.string;

public class OrString {
    public static void main(String[] args) {
        String ol = "Java";
        String lo = new StringBuilder(ol).reverse().toString();
        System.out.println(lo);

        String jo = "";

        for (int i = ol.length() - 1; i >=0; i--) {
            jo += ol.charAt(i);
        }
        System.out.println(jo   );
    }
}
