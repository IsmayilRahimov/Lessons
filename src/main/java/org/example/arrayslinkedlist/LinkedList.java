package org.example.arrayslinkedlist;

import org.w3c.dom.Node;

public class LinkedList {
    int head;
    Node tail;
    int size;
    public LinkedList() {
        head = 0;
        tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head =  11;
        ll.size = 12;
        ll.tail = null;
        System.out.println(ll);

    }

}
