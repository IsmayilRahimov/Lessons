package org.example.practice;

import java.util.Scanner;

public class SwithcCaseProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        switch (grade) {
            case 91 :
                System.out.println("A");
                break;
            case 81 :
                System.out.println("B");
                break;
            case 71:
                System.out.println("C");
            default:
                System.out.println("Sizin baliniz asagi oldugundan siz novbeti merheleye kece bilmediniz: ");
                break;
        }
    }
}
