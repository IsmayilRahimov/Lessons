package org.example.overlod;

public class TransportOverload {
    String transport(String suse) {
        return "Kamaz " + suse + " suse dasiyir";
    }

    String transport(String qum, String das) {
        return "Tir " + qum + das + " dasi aparir catdirmaga:";
    }

    public static void main(String[] args) {
        TransportOverload dasima = new TransportOverload();
        System.out.println(dasima.transport("plastik"));
        String a = dasima.transport("aqgum ", "kubik");
        System.out.println(a);
    }
}
