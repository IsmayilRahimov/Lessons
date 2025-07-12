package org.example.stack;

import java.util.Stack;
import java.util.Vector;

public class Stackk {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("qum");
        stack.push("daw");
        stack.push("pencere");
        System.out.println("Sonuncu element: " + stack.peek());
        System.out.println("Son element silindi: " + stack.pop());
        System.out.println("Stackteki elemanlar: " + stack);
        System.out.println("Stackteki eleman sayisi: " + stack.size());
        System.out.println("Sonuncu element: " + stack.peek());
    }
}
