package day43_map.map_recap;

import java.util.*;

public class Store {
    public static void main(String[] args) {
        //  KEY     VALUE
        Map<String, Double> store = new HashMap();

        // 1- put method
        store.put("Water", 1.9);
        store.put("Bread", 2.9);
        store.put("Cheese", 3.9);
        store.put("Coffee", 1.9);
        store.put("Banana", 4.9);

        store.put("Bread", 0.9); // KEY exist so it updated the value linked to that key
        System.out.println(store);

        // 2 - get(key)
        System.out.println(store.get("Water"));

        // 3 - remove(key)
        store.remove("Banana");
        System.out.println(store);

        // 4 - containsKey()

        System.out.println(store.containsKey("Water")); // true, we have the water
        System.out.println(store.containsKey("Banana")); // false, we removed it

        // 5 - containsValue()
        System.out.println(store.containsValue(2.9)); // false, this value was updated
        System.out.println(store.containsValue(4.9)); // false, this value was updated
        System.out.println(store.containsValue(3.9)); // true

        // 6 - size()
        System.out.println(store.size());

        System.out.println("---------------------------------------------------------");

        // 7 - .keySet()
        System.out.println( store.keySet() );
        Set<String> storeKeys = store.keySet();
        System.out.println(storeKeys);
        System.out.println();
        // Loop through the keys
        for (String eachKey : storeKeys){
            System.out.println(eachKey);
        }

        System.out.println("---------------------------------------------------------");
        // 8 - .values()
        System.out.println(store.values());
        Collection<Double> storeValues = store.values();
        System.out.println(storeValues);

        for(Double eachValue : storeValues){
            System.out.println(eachValue);
        }

        System.out.println("---------------------------------------------------------");
        // 9 - entrySet()
        // Map.Entry<String, Double> eachEntrySet
        // getKey()
        // getValue
        /*
        keys    values
       "Water", 1.9 --> ENTRYSET --> KEY-VALUE set
       "Bread", 2.9 --> ENTRYSET --> KEY-VALUE set
       "Cheese", 3.9 --> ENTRYSET --> KEY-VALUE set
       "Coffee", 1.9 --> ENTRYSET --> KEY-VALUE set
       "Banana", 4.9 --> ENTRYSET --> KEY-VALUE set
         */

        for (Map.Entry<String, Double> eachEntrySet : store.entrySet()){
            System.out.println(eachEntrySet); //  Water=1.9

            System.out.println(eachEntrySet.getKey()); // Water
            System.out.println(eachEntrySet.getValue()); // 1.9
            System.out.println();// Water

            System.out.println();
        }
    }
}
