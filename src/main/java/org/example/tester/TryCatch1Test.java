package org.example.tester;

import java.util.Scanner;

public class TryCatch1Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;

        try {
            System.out.println("Yazini daxil edin: null saxlamaq ucun entere vurun : ");
            input = scanner.nextLine();
            if (input.equals("")) {
                input = null;
                System.out.println("Sizin metnininiz: " + input.length());
            } else {
                System.out.println("Sizin metnininiz: " + input);
            }
        } catch (NullPointerException e) {
            System.out.println("Hecne daxil etmediniz:");
        } finally {
            System.out.println("Tesekkurler");
        }
    }
}

