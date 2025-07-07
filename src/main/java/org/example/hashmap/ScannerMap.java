package org.example.hashmap;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerMap {
    public static void main(String[] args) {

        Map<String, String> datalar = new HashMap<>();
        datalar.put("Eli", "0552222222");
        datalar.put("Azad", "0553333333");
        datalar.put("Aqil", "0554444444");
        datalar.put("Ixtiyar", "0555555555");
        Scanner scannner = new Scanner(System.in);
        System.out.print("Duzgun datani teyin edin: ");

        String data = scannner.nextLine();
        switch (data) {
            case "Eli":
                System.out.println("Eli telefon numarasi: " + datalar.get("Eli"));
                break;
            case "Azad":
                System.out.println("Azad telefon numarasi: " + datalar.get("Azad"));
                break;
            case "Aqil":
                System.out.println("Aqil telefon numarasi: " + datalar.get("Aqil"));
                break;
            default:
                System.out.println("Bele bir wexs yoxdur :");
        }


    }
}
