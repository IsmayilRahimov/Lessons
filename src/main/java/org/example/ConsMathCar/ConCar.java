package org.example.ConsMathCar;

public class ConCar {
    String transport (String qum){
        return "Kamaz "+ qum + "dasiyir";

    }
    String transport(String daw,String pencere){
        return "Kamaz "+ daw +" ve " + pencere + " dawiyir" ;

    }

    public static void main(String[] args) {
        ConCar c = new ConCar();
        String ilk = c.transport(" qum");
        System.out.println(ilk);
        String ikinci = c.transport(" daw " + " pencere ");
        System.out.println(ikinci);
    }
}
