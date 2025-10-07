package org.example.listarraymapoptional;

import java.util.*;

public class ListNonPr {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);

        System.out.println(num);

        List<Integer> num2 = new LinkedList<>();
        num2.add(1);
        num2.add(2);
        num2.add(3);
        System.out.println(num2);

        List<Integer> num3 = new Vector<>();
        num3.add(1);
        num3.add(2);
        num3.add(3);
        System.out.println(num3);

        List<Integer> num4 = new Stack<>();

        num4.add(1);
        num4.add(2);
        num4.add(3);
        System.out.println(num4);

        ArrayList<String> num6 = new ArrayList<>();
        num6.add("Anar");
        num6.add("Isa");
        num6.add("Eli");
        num6.add("Anar"); // uniklalliqga icaze verir
        System.out.println(num6);


    }
}

