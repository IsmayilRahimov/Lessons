package org.example.arrays;

public class ArraysExampleTest {
    public static void main(String[] args) {
        int[] numbers = {5,3,6,4,9};
        int min = numbers[0]; // 0 -nci indeksdeki ededi minuma beraber edir = 5;
        for (int i = 1; i < numbers.length; i++) { //forun icinde i=1 nci indekse =3;
            if (numbers[i] < min) { //eger 1nci indeks yeeni 3 minumum eded 0 nci indeksden kicikdrse deyirik,,

                min = numbers[i];  // 1 ci indeks 3 ededini beraber edirik minum edeede olur =3
            }
        }
        System.out.println(min);
    }
}
