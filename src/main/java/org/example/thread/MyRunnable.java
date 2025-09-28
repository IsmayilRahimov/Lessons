package org.example.thread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.printf("My Runnable started");
    }

    public static void main(String[] args) {
        Thread myrun = new Thread(new MyRunnable());
        myrun.start();
    }

}
