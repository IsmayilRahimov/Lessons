package org.example.exception;

public class Catch {
    public static void main(String[] args) {
        try {
            int result = 0 / 10;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Xeta bas verdi");
        }
    }
}
