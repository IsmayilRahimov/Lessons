package org.example.arrayslinkedlist;
 import java.util.LinkedList;

public class LinkedArrays {
    public static void main(String[] args) {

        LinkedList<String> fruit = new LinkedList<>();
        fruit.add("Alma");
        fruit.add("Banan");
        fruit.add("Kivi");

        System.out.println(fruit);
        fruit.remove("Alma");
        fruit.getFirst();
        System.out.println(fruit);
        System.out.println("Ilk element: " + fruit.getFirst());
        for (String fruits : fruit) {
            System.out.println(fruits);
        }

    }
}
