package org.example.ListArray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetnumber {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ededleri daxil et:");

        for( int i=0; i<5; i++ ) {

            int number = scanner.nextInt();

            numbers.add(number);




        }
        System.out.println(numbers);
        System.out.println("Unikal ededlerin sayi: "+numbers.size());
    }
}
