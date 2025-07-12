package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {


    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
        System.out.println(queue);
        System.out.println("Silinen element "+queue.poll());
        System.out.println("Bu sayda indeks var "+queue.element());
        System.out.println(queue);
        System.out.println("En birinci element " + queue.peek());

}
    }
