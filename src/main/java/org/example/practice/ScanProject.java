package org.example.practice;

import java.util.Scanner;

public class ScanProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil et:");

        int num = sc.nextInt();
//          eger qaliqsiz bolunurse
        if (num % 2 == 0) {
            System.out.println("true");
//         eger qaliqsiz bolunmurse
        } else if (num % 2 != 0) {
            System.out.println("false " + num + " Edediniz tekdir:");
        }

        if (num % 2 == 0) {
            System.out.println(num + " Edediniz cutdur");
        } else {
            System.out.println(num + " Edediniz tekdir");
        }
    }
}
