package org.example.overlod;

public class OverloadPractice {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadPractice s1 = new OverloadPractice();

        int x = s1.add(10, 20);
        int y = s1.add(1, 2, 3);
        System.out.println(x);
        System.out.println(y);
    }
}
