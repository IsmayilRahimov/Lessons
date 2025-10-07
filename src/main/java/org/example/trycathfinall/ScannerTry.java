package org.example.trycathfinall;

import java.util.Scanner;

public class ScannerTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try {
            System.out.println("Yasinizi daxil edin:");
            int age = input.nextInt();
            System.out.println("Sizin yasiniz : " + age);
        } catch (Exception e) {
            System.out.println("Xeta : Duzgun eded daxil edin:");
        } finally {
            System.out.println("Program burada bitir:");
        }
    }
}
