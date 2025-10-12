package org.example.overlod;

public class PracticeOverload {
    int add(int a, int b) {
        return a * b;
    }

    int add(int a, int b, int c) {
        return a * b / c;
    }

    double add(double f, double l) {
        return f / l;
    }

    public static void main(String[] args) {
        PracticeOverload mathutills = new PracticeOverload();

        int x = mathutills.add(10, 20);
        System.out.println(x);
        int u = mathutills.add(10, 20, 2);
        System.out.println(u);
        System.out.print(mathutills.add(10.2, 2.1));
    }
}
