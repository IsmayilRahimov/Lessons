package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ListMap {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("Anar", 17);
        data.put("Musa", 20);
        data.put("Murad", 32);
        data.put("Mehemmed", 41);
        System.out.println(data);
        System.out.println("Musanin yasi:" + data.get("Musa"));
        System.out.println("Haminin datasi :" + data.values());
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println("Ad: " + entry.getKey() + " Yash-" + entry.getValue());
        }

    }
}