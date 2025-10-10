package org.example.operators;

import java.util.Scanner;

public class IncrementDecrementOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        int a = input.nextInt();
        System.out.println("2-ci ededi daxil edin:");
        int b = input.nextInt();
        System.out.println((a != 0) ? (a + b) : b);
    }
}
