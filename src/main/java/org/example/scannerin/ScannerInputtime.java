package org.example.scannerin;

import java.util.Scanner;

public class ScannerInputtime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Adinizi  daxil edin :");
        String name = input.nextLine();

        System.out.println(" Yasinizi daxil edin:");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Vetendasliginizi qeyd edin :");
        String count = input.nextLine();


        System.out.println("Sizin adiniz :" + name);
        System.out.println("Sizin yasiniz :" + age);
        System.out.println("Sizin olkeniz :" + count);

        input.close();
    }
}
