package org.example.treeset;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>();
        List<String> list4 = new Stack<>();
        list.add("Eli");
        list.add("Eliyev");
        list2.add("Eliyeva");
        list2.add("Elnare");
        list3.add("Memmedov");
        list3.add("Musa");
        list4.add("Anar");
        list4.add("Ragimov");
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

    }
}
