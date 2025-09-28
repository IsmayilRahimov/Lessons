package org.example.thread;

public class ThreadProjects extends Thread {

    @Override
    public void run() {
        System.out.println("My Thread starting");
    }

    public static void main(String[] args) {
        Thread core = new ThreadProjects();
        core.start();



    }
}
