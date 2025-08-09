package day42_a_collection.collection;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {
        /*
            Q: what is the difference between List and Set?
                LIST:
                    - insertion order is kept
                    - allows duplicate
                    - allows null

                SET
                    - insertion order depends on what class it is:
                        - HashSet: random order
                        - LinkedHashSet: keeps insertion order
                        - TreeSet: sorted order (ASCII table)
                    - for allowing null:
                        - HashSet: accepts null
                        - LinkedHashSet: accepts null
                        - TreeSet: NOT allow null
                    - NOT allow duplicate

         */
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(-5);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(4);
        list.add(null);
        System.out.println(list);

        System.out.println("---------------------------------------------");

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(-5);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(4);
        set.add(null);
        System.out.println(set);

        System.out.println("---------------------------------------------");

        // Q: How we can get the elements for set? each element
        // A: foreach ---> works with collection or object

        for(Integer each : set){
            System.out.println(each);
        }

        System.out.println();
        // same thing can be applied to list too

        for(Integer each : list){
            System.out.println(each);
        }

        System.out.println();
        // Q: Can you sort HashSet?
        set.remove(null);
        System.out.println(set);
        Set<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);

        System.out.println();
        // Q: Can you remove duplicates
        System.out.println(list);
        Set<Integer> setNoDup = new HashSet<>(list);
        System.out.println(setNoDup);

        System.out.println();
        // Q: Can you remove duplicates and sort?
        System.out.println(list);
        list.remove(null);
        Set<Integer> setNoDupAndSort = new TreeSet<>(list);
        System.out.println(setNoDupAndSort);

        System.out.println("==================================");
        String str = "dfwoihwoiefwioef2347-1-1fjj";

        // get me the letters from each (remove duplicates)
        //str.split(""); // ["d", "f", "w"....]
        //Arrays.asList(str.split("")).forEach(System.out::println); // converting string into collection type
        Set<String> strSet = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println(strSet);

        // remove duplicates + also keeping insertion order
        Set<String> strSet2 = new LinkedHashSet<>(Arrays.asList(str.split("")));
        System.out.println(strSet2);

        // remove duplicates + now we sort it
        Set<String> strSet3 = new TreeSet<>(Arrays.asList(str.split("")));
        System.out.println(strSet3);

        System.out.println("==================================");

        List<String> linkedList = new LinkedList<>(Arrays.asList(str.split("")));
        System.out.println(linkedList);
    }
}
