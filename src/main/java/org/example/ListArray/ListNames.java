package org.example.ListArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListNames {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        System.out.println("Adlari daxil et:");


        for (int i = 0; i < 5; i++) {

            Scanner scanner = new Scanner(System.in);

            names.add(scanner.nextLine());

            System.out.println(names);

        }
       //true false
        if (names.contains("Elvin")) {
            System.out.println("Ad var");
        } else {
            System.out.println("Ad yoxdur");
        }if(names.size()>5){
            System.out.println("Adlar budur" + names);
        }else {
            System.out.println("Adlarin sayi 5 den boyuk deyil");
        }

//            names.remove("Elvin");

    }


}

