package org.example.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("My Thread");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

    }
}
