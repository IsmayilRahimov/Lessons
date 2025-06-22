package org.example.OpExtends;

public class Cat extends Animals {
    void meowing() {
        System.out.println(name + " myoldayir:");
    }

    void aged() {
        System.out.println(name + age + " yawi var:");
    }
    @Override       // animaldan ovverride edirik metodu request response oldugu kimi qalir:
    void voice(){
        System.out.println("Mimi miyoldayir ");
    }
}
