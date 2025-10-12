package org.example.StringCore;

import java.util.Arrays;

public class StringIntpr {
    public static void main(String[] args) {
        String ad = "How are you?";
        String bob = "";

        for (int i = ad.length() - 1; i >= 0; i--) {
            bob += ad.charAt(i);
        }
        System.out.println(bob);

        String name = "Musa";
        String exname = new StringBuilder(name).reverse().toString();
        System.out.println(exname);

        int[] num = {5, 9, 7, 4};
        int min = num[0];
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
