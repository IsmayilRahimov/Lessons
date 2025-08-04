package org.example.practice;

import java.util.Scanner;

public class ScannerProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first numbers:");
        int num1 = scanner.nextInt();
        System.out.print("Please enter second numbers:");
        int num2 = scanner.nextInt();
        System.out.print("Please enter the operator: [ + , - , /, *, % ] :");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Sum is " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction is " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication is " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division is " + (num1 / (double) num2));
                break;
            case '%':
                System.out.println("Remainder is " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }


    }
}
