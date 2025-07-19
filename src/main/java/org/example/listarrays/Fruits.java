package org.example.listarrays;

import java.util.LinkedList;
import java.util.List;

public class Fruits {
    public static void main(String[] args) {
        List<String> vazol = new LinkedList<>() ;

        vazol.add("apple");
        vazol.add("banana");
        vazol.add("orange");
        vazol.add("grapes");
        vazol.add("mango");
        vazol.add("pineapple");
        vazol.add("watermelon");
        vazol.add("cherry");
        System.out.println(vazol);
        vazol.remove("apple");
        vazol.size();
        System.out.println(vazol);
        vazol.add(0,"melon");
    }
}
