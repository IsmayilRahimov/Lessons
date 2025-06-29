package org.example.abstraction;

public abstract class Mike extends Feelings implements Behaviour{

    @Override
    public void laugh() {
        System.out.println("Mike laugh");

    }
    @Override
    public void cry(String name) {
        System.out.println("Mike cry" + name);
    }
    @Override
    public void smiles() {
        super.smiles();
    }

    public void cry() {
        System.out.println( "Mike cry");
    }

    @Override
    public void smile() {

    }

    @Override
    public void walk() {

    }

    public void main(String[] args) {

        Mike mike = new Mike() {
            @Override
            public void eat() {
                System.out.println( "Mike eat");
            }
        };
        mike.cry();
        mike.laugh();
        mike.smile();
        mike.walk();
        mike.cry("Mike");
        mike.smile();




    }
}
