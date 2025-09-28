package org.example.thread;

public class Myrun implements Runnable {

    @Override
    public void run() {
        System.out.printf("MyRunnable started");
    }

    public static void main(String[] args) {
        Thread runa = new Thread(new Myrun());
        runa.start();
    }
}
