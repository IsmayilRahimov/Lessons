package org.example.consturctorsleson;

public class Transport {
    String transport (String qum){
        return "Kamaz "+qum+" getirir";
    }
    String transport (String daw,String pencere){
        return "Kamaz "+ daw + pencere+ " getirir ";
    }

    public static void main(String[] args) {
        Transport transport = new Transport();
        String ilk =transport.transport("qum ");
        System.out.println(ilk);
        String ikinci=transport.transport(" daw ","pencere");
        System.out.println(ikinci);
    }
}
