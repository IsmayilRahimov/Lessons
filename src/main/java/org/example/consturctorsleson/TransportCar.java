package org.example.consturctorsleson;

public class TransportCar {
    String transport(String kerpic) {
        return "Kamaz " + kerpic + " getirir";
    }

    String transport(String daw, String pencere) {
        return "Kamaz " + daw + pencere + " getirir ";
    }

    String transport(int su, int havaqazi) {
        return "Kamaz" + su + havaqazi + "getirir";

    }

    public static void main(String[] args) {
        TransportCar transportCar = new TransportCar();
        String ilk = transportCar.transport("kerpic");
        System.out.println(ilk);
        String ikinci = transportCar.transport("daw", "pencere");
        System.out.println(ikinci);
        String ucuncu = transportCar.transport(2 + " litr su " + 3 + " litr havaqazi ");
        System.out.println(ucuncu);

    }
}
