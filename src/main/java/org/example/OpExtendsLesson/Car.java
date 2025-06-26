package org.example.OpExtendsLesson;

public class Car extends Vehicle{
    @Override
    void move(){
        super.move();
        System.out.println("car moving");
    }
    void stop(){
        super.stop();
        System.out.println("car stop");
    }
}
