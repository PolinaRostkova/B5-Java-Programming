package day43_map.map_recap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FequencyOfChars {
    public static void main(String[] args) {
        String str = "loopcamp";


        // Option 1 - use the nested loop and with if condition find how many times each character appears
        frequencyOfChars(str);
        System.out.println(frequencyOfChars2(str));
    }

    /*
    l - 1 
    0 - 2
    p - 2
    c - 1
    a - 1
    m - 1
    
     */
    public static void frequencyOfChars(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character eachChar = str.charAt(i);

            if (map.containsKey(eachChar)) {
                map.put(eachChar, map.get(eachChar) + 1);
            } else {
                map.put(eachChar, 1);
            }
        }
        System.out.println(map);
    }

    public static Map<Character, Integer> frequencyOfChars2(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character eachChar = str.charAt(i);

            if (map.containsKey(eachChar)) {
                map.put(eachChar, map.get(eachChar) + 1);
            } else {
                map.put(eachChar, 1);
            }
        }
        return map;
    }
}
