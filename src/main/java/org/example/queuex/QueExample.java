package org.example.queuex;

import java.util.LinkedList;
import java.util.Queue;

public class QueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alim");
        queue.add("Murad");
        queue.add("Fexri");

        System.out.println("Birinci elementi goster: " + queue.peek()); // birincini gosterir
        System.out.println("Birinci elementi  sil: " + queue.poll()); // silme
        System.out.println("Sonda adlari goster:" + queue);
        System.out.println("Queue size: " + queue.size()); //
        System.out.println("Elave edirem: " +queue.add("Anar") +" Anar");
        System.out.println(queue);

    }
}
