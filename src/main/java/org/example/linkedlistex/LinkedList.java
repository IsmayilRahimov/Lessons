package org.example.linkedlistex;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> meyve = new ArrayList<>();
        meyve.add("alma");
        meyve.add("armut");
        meyve.add("kivi");
        meyve.add("uzum");

        if (meyve.contains("uzum")) {
            System.out.println("uzum var");
        } else {
            System.out.println("uzum yoxdu");

        }
        System.out.println(meyve);
        meyve.set(1, "kivi");
        System.out.println(meyve);
    }
}
