package org.example.queuex;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Alim");
        stack.push("Murad");
        stack.push("Fexri");

        System.out.println("Stack size: " + stack.size());
        System.out.println(stack.peek()); // burda ppek metodunda en sonuncudan baslayir
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
