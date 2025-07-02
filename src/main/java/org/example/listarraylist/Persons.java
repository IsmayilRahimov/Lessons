package org.example.listarraylist;

import java.util.List;
import java.util.Scanner;

public class Persons {
    public static void main(String[] args) {
        List<String> persons = List.of("Elvin", "Eli", "Musa", "Murat");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Listde bir ad secin");
        String name = scanner.nextLine();
        persons.add(name);
        System.out.println(persons);
        if (persons.contains("Ismayil")) {
            System.out.println("Murat var");
        } else {
            System.out.println("Murat yoxdur");
        }
    }

}



