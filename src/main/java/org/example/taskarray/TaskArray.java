package org.example.taskarray;

public class TaskArray {
    public static void main(String[] args) {
        int num [] = new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;

        int eded = 0;
        int multiplier =1;

        for (int indexOfArray = num.length - 1; indexOfArray >= 0; indexOfArray--) {

            eded += num[indexOfArray] * multiplier;
            multiplier+=10;


        }
        System.out.println(eded);


    }
}
