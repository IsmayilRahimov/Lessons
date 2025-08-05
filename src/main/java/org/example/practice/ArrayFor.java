package org.example.practice;

public class ArrayFor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int element : numbers) {
            System.out.println(element * element);
            System.out.println(element - element);
            System.out.println(element / element);
        }
    }
}
