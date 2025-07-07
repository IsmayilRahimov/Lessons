package org.example.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        HashMap<Integer,List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("qasimov");
        list.add("Musa");
        list.add("Murat");
        list.add("Mohammad");
        map.put(1,list);
        System.out.println(map);
        Map<String,String> map1 = new HashMap<>();
        map1.put("qasimov","qasimov");
        map1.put("Musa","Musa");
        map1.put("Murat","Murat");
        map1.put("Mohammad","Mohammad");
        System.out.println(map1);


    }
}
