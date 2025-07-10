package org.example.arrays;

public class ArraysCem {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        int sum = 0;
        sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        System.out.println(sum);
        int ortalama = sum / numbers.length;
        System.out.println(ortalama);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
