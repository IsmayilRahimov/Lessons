package org.example.practice;

public class WhileLoopPr {
    public static void main(String[] args) {
        int a = 0;
        while (a < 5) {
            if (a % 2 == 0) {
                System.out.println("a=" + a);
            }
            a++;

        }
        System.out.println("a=" + a);
    }
}
