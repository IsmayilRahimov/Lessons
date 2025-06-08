package org.example.consturctorsleson;

public class Mathutills {
    int add(int a, int b) {
        return a + b;

    }
    double add(double b, double c) { // 2 parametrli cons
        return b / c;
    }
    double add(double b,double c,double d) {// 3 parametrli kons
        return b+c+d;

    }

    public static void main(String[] args) {
        Mathutills mathutills = new Mathutills(); // obyekt yaradiram
        int x = mathutills.add(10, 20);
        System.out.println(x);
        double a = mathutills.add(20.34, 20.2);
        System.out.println(a);
        double b = mathutills.add(20.34, 20.2, 20.1);
        System.out.println(b);
    }
}
