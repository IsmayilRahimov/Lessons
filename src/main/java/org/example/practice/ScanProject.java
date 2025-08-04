package org.example.practice;

import java.util.Scanner;

public class ScanProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil et:");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("true");

        } else if (num % 2 != 0) {
            System.out.println("false");
        }
    }
}
