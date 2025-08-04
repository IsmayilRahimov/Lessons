package org.example.practice;

import java.util.Scanner;

public class GradeStud {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int grade = scr.nextInt();
        if (grade > 91) {
            System.out.println("A");
        } else if (grade > 81) {
            System.out.println("B");
        } else if (grade > 71) {
            System.out.println("C");
        } else if (grade > 61) {
            System.out.println("D");
        } else if (grade > 51) {
            System.out.println("E");
        } else {
            System.out.println("Sizin baliniz asagi oldugundan siz novbeti merheleye kece bilmediniz: ");
        }
    }
}
