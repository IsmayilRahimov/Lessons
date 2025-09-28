package org.example.thread;

public class Threaddd extends Thread {

    @Override
    public void run() {
        System.out.println("My Threadd runnable");
    }

    public static void main(String[] args) {
        Threaddd a = new Threaddd();
        a.start();
    }
}
