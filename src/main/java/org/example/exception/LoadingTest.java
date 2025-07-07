package org.example.exception;

import java.lang.Exception;

public class LoadingTest {
    public static void main(String[] args) {
        System.out.println("Zehmet olmasa gozleyin");
        try{
               Thread.sleep(3000);

        }catch (InterruptedException e){
            System.out.println("Zehmet olmasa gozleyin");
        }throw new RuntimeException ("Bitdi:") ;

        }

        }



