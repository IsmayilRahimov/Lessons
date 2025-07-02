package org.example.listarraylist;

import java.util.ArrayList;
import java.util.List;

public class City {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Baku", "Ganja"));
        System.out.println(cities);

        System.out.println(cities);


        List<String> names = new ArrayList<>();
        names.add("Elvin");
        names.add("Eli");
        names.add("Musa");
        names.add("Murat");

        names.remove("Murat");
        names.size();
        names.addFirst("Alican");
        System.out.println(names);
        System.out.println(names.size());

;
    }
}
