package org.example.arrayslinkedlist;
import java.util.LinkedList;
public class ArraysLinked {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grapes");
        System.out.println(fruits);
        fruits.remove("apple");
        System.out.println(fruits);
        fruits.removeFirst();
        System.out.println(fruits);

    }
}
