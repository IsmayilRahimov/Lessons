package org.example.trycathfinall;

public class TryPr {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("0 bolme yoxdur:");
        } finally {
            System.out.println("Bu blok her zaman isleyir");
        }
    }
}
