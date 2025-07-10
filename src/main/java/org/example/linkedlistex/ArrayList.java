package org.example.linkedlistex;

import java.util.LinkedList;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {


        List<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
        numbers.remove(numbers.size() - 1);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);

    }
}
