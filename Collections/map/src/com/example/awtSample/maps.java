package com.example.awtSample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {

    public static void main(String[] args) {
        Map<String, String> map= new HashMap<>();
        map.put("myName", "Umair");
        map.put("actor", "shaan");
        map.put("ceo", "Ejaz");

        //System.out.println(map);

        //System.out.println(map.get("actor"));


        if (map.containsKey("ceo")){
            System.out.println("Company will perform excellent");
        } else {
            System.out.println("It the tough to control company");
        }

        for (String key : map.keySet()){
            System.out.println(key+ " : "+map.get(key));
        }
    }
}
