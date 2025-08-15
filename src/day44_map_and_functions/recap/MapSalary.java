package day44_map_and_functions.recap;

import java.util.*;

public class MapSalary {
    public static void main(String[] args) {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("John", 1000.00);
        map.put("Tom", 2000.00);
        map.put("Jerry", 3000.00);
        map.put("Winnie", 4000.00);
        map.put("Pooh", 5000.00);

        System.out.println(map);
        System.out.println("--------------------------------------------------------");
        // Find the min and max salary
        // convert to TreeMap because it sorts --> but will sort based on the keys
        // loop through
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (Double each : map.values()){
            if (each > max) max = each;
            if (each < min) min = each;
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println("--------------------------------------------------------");
        // convert to TreeSet
        //Set<Double> values = new TreeSet<>(map.values());
        //values.getFirst // since Set does NOT have access to these methods values will not be able to reach that
        TreeSet<Double> values2 = new TreeSet<>(map.values());
        System.out.println("Min: " + values2.getFirst());
        System.out.println("Max: " + values2.getLast());

        System.out.println("--------------------------------------------------------");
        // Q: Can you find the names for who is making max and min salary
        // 1 - looping through

        for (Map.Entry<String, Double> eachEntry : map.entrySet()){
            if (eachEntry.getValue() == max) System.out.println("Person that makes the most money: "  + eachEntry.getKey());
            if (eachEntry.getValue() == min) System.out.println("Person that makes the least money: "  + eachEntry.getKey());
        }

        System.out.println("--------------------------------------------------------");
        // Q: Find the person that makes 2000

        List<String> namesWhoMakesMore2000 = new ArrayList<>();
        for (Map.Entry<String, Double> eachEntry : map.entrySet()){
            if (eachEntry.getValue() > 2000) namesWhoMakesMore2000.add(eachEntry.getKey());
        }

        System.out.println("All the names who makes more that 2000: " +  namesWhoMakesMore2000);


        System.out.println("--------------------------------------------------------");

        // Q: Our manager wants to increase everyone's salary by 2k
        System.out.println("-------------------------------------------");
        // Q: Find all the names who make than 2000
        ArrayList <String> nameWhoMakeThan2000 = new ArrayList<>();
        for ( Map.Entry<String, Double> eachKeyValue: map.entrySet()) {

            if ( eachKeyValue.getValue() > 2000) {
                nameWhoMakeThan2000.add(eachKeyValue.getKey());
            }

        }
        System.out.println("All the names who make more than 2K: " + nameWhoMakeThan2000);


        System.out.println("-------------------------------------------");
        // Q: Lets say our manager, want to increase everyones salar by 2000;
        // 1 - with ENTRY SET
        for ( Map.Entry <String, Double> eachEntry : map.entrySet()) {
            map.put(eachEntry.getKey(), eachEntry.getValue() + 2000);
        }
        System.out.println(map);


        // 2 - with KEYSET
        for ( String eachKey : map.keySet()) {
            map.put(eachKey, map.get(eachKey) + 2000);
        }
        System.out.println(map);


        System.out.println("-------------------------------------------");
        Map<String, String> salaryMap2 = new LinkedHashMap<>();
        salaryMap2.put("John", "John");
        salaryMap2.put("Tom", "Mike");
        salaryMap2.put("Jerry", "Merry");
        salaryMap2.put("Winnie", "Test");
        salaryMap2.put("Pooh", "Example");
        System.out.println(salaryMap2);

        // change the last name to be and email -- > last+"@gmail.com"
        for ( String eachKey : salaryMap2.keySet()){
            salaryMap2.put(eachKey, salaryMap2.get(eachKey) + "@gmail.com");
        }
        System.out.println(salaryMap2);
    }
}
