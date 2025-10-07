package org.example.op;

public class MethodOverLoading {

    public int add(int a, int b, int c) {
        return a + b - c;
    }

    public double add(int a, int b) {
        return a - b;
    }

    public int add(int a, int b, int c, int n) {
        return a - b - c - n;
    }

    public static void main(String[] args) {
        MethodOverLoading m = new MethodOverLoading();

        System.out.println(m.add(4, 4, 2, 1));
        System.out.println(m.add(1, 2, 3));

    }
}
