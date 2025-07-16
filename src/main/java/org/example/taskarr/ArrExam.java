package org.example.taskarr;

import org.example.arrTask.TaskArrays;

import java.util.Scanner;

public class ArrExam {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 eded daxil edin: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }


        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < 0) {
                min = num;

            } else if (num > max) {
                max = num;
            }


        }
        System.out.println("En buyuk eded: " + max);
        System.out.println("En kicik eded: " + min);
        System.out.println("En ortalamasi: : " + TaskArrays.findaverage(numbers));
        System.out.println("En buyuk eded: " + TaskArrays.findmax(numbers));
        System.out.println("En kicik eded: " + TaskArrays.findmin(numbers));
    }
}
