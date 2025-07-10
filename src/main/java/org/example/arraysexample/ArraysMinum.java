package org.example.arraysexample;

public class ArraysMinum {
    public static void main(String[] args) {
        int[]num= {9,8,7,6,5};

        int min = num[0]; // minum = 9;

        for (int i = 1; i < num.length; i++) {

            //    i=8<9 == dogrudur;
            if (num[i]<min){
                // minumum artiq 8 dir//
                min = num[i];
            }
        }
        System.out.println(min);
    }
}
