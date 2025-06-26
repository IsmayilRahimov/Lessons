package org.example.ConsMathCar;

public class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);

    }
    void sub(int a, int b) {
        System.out.println(a - b);

    }
    void mul(int a, int b) {
        System.out.println(a * b);

    }
    void div(int a, int b) {
        System.out.println(a / b);
    }
    void mod(int a, int b) {
        System.out.println(a % b);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.sub(10, 20);
        c.mul(10, 20);
        c.div(10, 20);
        c.mod(10, 20);

    }
}
