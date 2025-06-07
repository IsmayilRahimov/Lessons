package org.example.taskintArray;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];  // 5, 9, 1, 0, 3More actions

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[4]; // 3
        int max = numbers[3]; // 0

        for (int num : numbers) {
            //  9   <  1
            if (num < min) {
                //  min = 3
                min = num;
                //     9   >  10
            } else if (num > max) {
                max = num;
                \







            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);

    }


}



