package org.example.listarraylist;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Volkswagen");

        System.out.println(cars);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<List<String>> carsList = new ArrayList<>();
        carsList.add(cars);
        List<List<Integer>> numbersList = new ArrayList<>();
        numbersList.add(numbers);
        System.out.println(numbersList);

    }
}
