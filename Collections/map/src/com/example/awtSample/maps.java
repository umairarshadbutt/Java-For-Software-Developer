package com.example.awtSample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("================================================");

        languages.remove("Lisp");

        if (languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol no removed, key/value pair not found");
        }

        if (languages.replace("Lisp", "Therein lies madness", "a functional languages")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp not replaced");
        }


        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }











//        Map<String, String> map= new HashMap<>();
//        map.put("myName", "Umair");
//        map.put("actor", "shaan");
//        map.put("ceo", "Ejaz");
//
//        //System.out.println(map);
//
//        //System.out.println(map.get("actor"));
//
//
//        if (map.containsKey("ceo")){
//            System.out.println("Company will perform excellent");
//        } else {
//            System.out.println("It the tough to control company");
//        }
//
//        for (String key : map.keySet()){
//            System.out.println(key+ " : "+map.get(key));
//        }
    }
}
