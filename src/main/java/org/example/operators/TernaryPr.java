package org.example.operators;

import java.util.Scanner;

public class TernaryPr {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int max = (a > b) ? a : b;
        System.out.println("Max " + max);

        int age = 17;
        String status = (age >= 18) ? "Boyuksen" : "Usaqsan ";
        System.out.println(status);

        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        String status2 = (result >= 17) ? "Yasin azdir " : "Yasin budur" + result;
        System.out.println(status2);
        int max2 = 0;
        int max1 = 0;
        if (result > 18) {
            max1 = result;
        } else {
            max2 = result;
        }
        System.out.println(result);
    }
}
