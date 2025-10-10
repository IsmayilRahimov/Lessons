package org.example.operators;

public class OperatorsPractice {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        System.out.println("a == b " + (a == b)); // false
        System.out.println("a != b " + (a != b));  //true
        System.out.println("a >= b " + (a >= b)); // true
        System.out.println("a <= b " + (a <= b));  // false
        System.out.println();

        boolean x = true;
        boolean y = false;

        System.out.println("x && y " + (x && y)); // false
        System.out.println("x || y " + (x || y));  //true
        System.out.println("!x" + (!x));  // false
        System.out.println(!y); // true
        System.out.println(x && y); // false
        System.out.println(x || y); // true


    }
}
