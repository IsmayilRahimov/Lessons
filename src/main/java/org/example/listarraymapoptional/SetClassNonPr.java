package org.example.listarraymapoptional;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassNonPr {

    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("Zema");
        name.add("Abu");
        name.add("Musa");
        name.add("Zema");
        System.out.println(name);

        Set<Integer> num = new LinkedHashSet<>();
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(1);
        num.add(4); // sirali saxlayir
        System.out.println(num);

        Set<Integer> num2 = new TreeSet<>();
        num2.add(1);
        num2.add(2);
        num2.add(2);
        num2.add(0);
        System.out.println(num2);
    }
}
