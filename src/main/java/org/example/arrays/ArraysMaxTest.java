package org.example.arrays;

public class ArraysMaxTest {
    public static void main(String[] args) {
        int[] numbers = {10,15,9,16,11};

        int max = numbers[0]; // maxi beraber edirik=10-a (yeni 0 -nci indekse);

        for (int i = 1; i < numbers.length; i++) { // i =1-nci indeks yeni 15 ededine

                     //15 >  10 = max ededine beraber edirik max olur uje 15;
            if (numbers[i] > max) {    // max oldu 15

                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
