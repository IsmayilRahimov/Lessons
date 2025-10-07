package org.example.listarraymapoptional;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapNonProject {
    public static void main(String[] args) {
        Map<String, Integer> elements = new HashMap<>();

        elements.put("Anar", 1);
        elements.put("Anar", 2);
        elements.put("Azad", 3);

        System.out.println(elements);

        Map<Integer, String> agesname = new TreeMap<>();
        agesname.put(1, "Akif");
        agesname.put(2, "Samir");
        agesname.put(3, "Azad");
        agesname.put(4, "Azad");
        agesname.put(4, "Eli");
        System.out.println(agesname);

        Map<Integer, String> age2be = new LinkedHashMap<>();
        age2be.put(1, "Anar");
        age2be.put(2, "Asim");
        age2be.put(2, "Anar");
        System.out.println(age2be);


    }
}
