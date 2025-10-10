package org.example.operators;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        boolean isLoggedIn = false;

        String message = isLoggedIn ? "Xos geldin " : "Zehmet olmasa daxil olun:";
        System.out.println(message);    //true          // false

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String result = (num % 2 == 0) ? "Cut eded" : "Tek eded";
        System.out.println(result); // tek eded
    }
}
