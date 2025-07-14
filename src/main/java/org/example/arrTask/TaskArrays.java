package org.example.arrTask;

import java.util.Scanner;

public class TaskArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("5 eded daxil edin: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("En buyuk eded: "+findmax(numbers));
        System.out.println("Ededlerin ortalamasi: : "+findaverage(numbers));
        System.out.println("En kicik eded: "+findmin(numbers));
    }
    public static int findmax(int[] ededler){
        int max = ededler[0];
        for (int num: ededler) {
            if (max < num) {
                max = num;
            }
        }
        return max;

    }
    public static int findaverage(int[] ededler){
        int sum = 0;
        for (int num: ededler) {
            sum += num;
        }
        return sum/5;
    }
    public static int findmin(int[] ededler){
        int min = ededler[0];
        for (int num: ededler) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }
}
