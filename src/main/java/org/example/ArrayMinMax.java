package org.example;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {11, 5, 9, 10};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min eded:" + min);
        System.out.println("Max eded:" + max);
    }

}
