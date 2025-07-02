package org.example.listarraylist;

import java.util.List;

public class Persons {
    public static void main(String[] args) {
        List<String> persons = List.of("Elvin", "Eli", "Musa", "Murat");
        if (persons.contains("Ismayil")) {
            System.out.println("Murat var");
        } else {
            System.out.println("Murat yoxdur");
        }
    }

}



