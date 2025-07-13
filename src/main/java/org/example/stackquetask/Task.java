package org.example.stackquetask;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Cumleni soz soz yazin: ");

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("bitir")) {
                break;
            }
            stack.push(name);
        }
        System.out.println("Netice: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
        scanner.close();
    }
}
