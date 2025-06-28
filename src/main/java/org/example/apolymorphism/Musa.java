package org.example.apolymorphism;

public class Musa extends Insan{
    void drink(String viski) {
        System.out.println("musa icki icir" + viski);
    }

    public static void main(String[] args) {
        Musa musa = new Musa();
        musa.drink( " viski");
    }
}
