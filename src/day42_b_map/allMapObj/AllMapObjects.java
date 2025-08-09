package day42_b_map.allMapObj;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Feyruz", "Java");
        map.put("Nadir", "Selenium");
        map.put("Diana", "Mentor");
        map.put("Iryna", "Mentor");
        map.put(null, "general");
        map.put("test", null);
        map.put("check", null);
        System.out.println(map);

        System.out.println("==============================================================");

        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("Feyruz", "Java");
        map2.put("Nadir", "Selenium");
        map2.put("Diana", "Mentor");
        map2.put("Iryna", "Mentor");
        map2.put(null, "general");
        map2.put("test", null);
        map2.put("check", null);
        System.out.println(map2);

        System.out.println("==============================================================");

        Map<String, String> map3 = new TreeMap<>();
        map3.put("feyruz", "Java");
        map3.put("nadir", "Selenium");
        map3.put("diana", "Mentor");
        map3.put("iryna", "Mentor");
        map3.put("null", "general"); // null is not okay for TreeMap
        map3.put("test", null);
        map3.put("check", null);
        System.out.println(map3);

        System.out.println("==============================================================");

        Map<String, String> map4 = new Hashtable<>();
        map4.put("feyruz", "Java");
        map4.put("nadir", "Selenium");
        map4.put("diana", "Mentor");
        map4.put("iryna", "Mentor");
        //map4.put(null, "general"); // KEYS cant be null
//        map4.put("test", null); // values cant be null too
//        map4.put("check", null);
        map4.put("test", "mentor");
        System.out.println(map4);
        /*
            HashMap
                - random order based on KEY
                - no duplicate KEYS
                - VALUES duplicates are okay
                - KEY and VALUE null is okay

            LinkedHashMap:
                - insertion order is kept based on KYY
                - KEYS no duplicate allowed
                - VALUES can have duplicates
                - KEY and VALUE null is okay

            TreeMap:
                - order is SORTED
                - KEYS null is NOT okay
                - VALUES can have duplicates
                - KEYS no duplicates allowed

            Hashtable:
                - random order
                - KEYS no duplicates
                - VALUES duplicates are okay
                - KEYS null are NOT okay
                - VALUES null are NOT okay
                - !!Synchronized / Thread safe!!
         */

    }
}
