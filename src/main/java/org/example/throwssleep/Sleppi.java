package org.example.throwssleep;

import java.util.Scanner;

public class Sleppi {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Buyurun:");
        Thread.sleep(3000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil et:");
        int number = scanner.nextInt();
        System.out.println("Sizin daxil etdiyiniz mebleg: "+number+"manat");

    }
}
