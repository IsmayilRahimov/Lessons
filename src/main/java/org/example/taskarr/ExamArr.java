package org.example.taskarr;

import org.example.arrTask.TaskArrays;

import java.util.Scanner;

public class ExamArr {
    public static void main(String[] args) {
        int[] numbers = new int[5];  // 5 eded arrays yaradiriq:
        Scanner scanner = new Scanner(System.in); // 5 eded daxil etmeyini isteyirik:
        System.out.println("5 eded daxil et:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0]; // minumum eded 0 -ci elemente beraberdir;

        int max = numbers[0]; // max ededi 0-ci elemente beraber edirik;

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

        }
        System.out.println("En buyuk eded:" + max);
        System.out.println("En kicik eded:" + min);
        System.out.println();
        System.out.println("En buyuk eded: " + TaskArrays.findmax(numbers));
        System.out.println("En kicik eded: " + TaskArrays.findmin(numbers));
        System.out.println("En ortalamasi: : " + TaskArrays.findaverage(numbers));
    }
}
