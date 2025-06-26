package org.example.ConsMathCar;

public class ConSaq {
    String saq(String qum) {
        return "Kamaz " + qum + "dasiyir";
    }

    int saq(int daw, int pencere) {
        return daw + pencere;
    }

    public static void main(String[] args) {
        ConSaq c = new ConSaq();
        String ilk = c.saq(" qum");
        System.out.println(ilk);
        int ikinci = c.saq(10, 20);
        System.out.println(ikinci);
    }
}
