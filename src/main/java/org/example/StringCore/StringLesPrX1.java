package org.example.StringCore;

public class StringLesPrX1 {
    public static void main(String[] args) {
        int[] num = {99, 88, 111, 77};
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
        System.out.println(min);
        System.out.println(max);
    }
}
