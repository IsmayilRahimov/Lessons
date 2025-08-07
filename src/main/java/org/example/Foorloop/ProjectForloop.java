package org.example.Foorloop;

public class ProjectForloop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] array = new int[i];
            for (int j = 0; j < i; j++) {
                array[j] = j + 1;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}
