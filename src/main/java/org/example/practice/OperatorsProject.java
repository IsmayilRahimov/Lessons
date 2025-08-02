package org.example.practice;

public class OperatorsProject {
    public static void main(String[] args) {
        int divider = 23;
        int remainder = 10;
        int result = divider % remainder;
        int result2 = divider - remainder;
        System.out.println("subtraction is " + result2);
        int result3 = divider / remainder;
        System.out.println("division is " + result3);
        int result4 = divider * remainder;
        System.out.println("multiplication is " + result4);
        int result5 = divider + remainder;
        System.out.println("addition is " + result5);

        System.out.println("remainder is " + result);
    }
}
