package org.example.arraysset;

import java.util.Arrays;

public class ArraySet {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] ededler = new int[10];

        ededler[0] = 1;
        ededler[1] = 2;
        ededler[2] = 3;
        ededler[2] = 4;
        ededler[2] = 5;
        System.out.println(ededler[2]);
        System.out.println(Arrays.toString(ededler));
    }
}
