package day41_collection.set;

import java.util.*;

public class SetObjects {
    public static void main(String[] args) {


        /*
            HashSet<String> hashSet1 = new HashSet<>();    / reference is itself
             Set<String> hashSet1 = new HashSet<>();        / reference is Parent interface List
            Collection<String> hashSet1 = new HashSet<>();   / Reference: "Parent" interface collection
             Iterable<String> hashSet1 = new HashSet<>();     / Reference: "Parent" interface of collection
         */

         /*
        HashSet
            - internally using tail and head structure
            - Insertion order is NOT kept / random order
            - does not have indexes
            - it accepts null value as well
            - it DOES NOT accept duplicate values
         */
        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add(null);
        hashSet1.add("hello");
        hashSet1.add("9.99");
        hashSet1.add("400");
        hashSet1.add("hello");
        hashSet1.add("$");
        System.out.println(hashSet1);

        System.out.println("---------------------------------");
         /*
        LinkedHashSet
            - internally using tail and head structure
            - Insertion order is kept
            - does not have indexes
            - it accepts null value as well
            - it DOES NOT accept duplicate values
         */
        Set<String> hashSet2 = new LinkedHashSet<>();
        hashSet2.add(null);
        hashSet2.add("hello");
        hashSet2.add("9.99");
        hashSet2.add("400");
        hashSet2.add("hello");
        hashSet2.add("$");
        System.out.println(hashSet2);

        System.out.println("---------------------------------");
         /*
        TreeSet
            - in addition sorted set interface can also be reference for TreeSet()
            - internally using tail and head structure
            - Insertion order is SORTED  (aligning with ASCII table)
            - does not have indexes
            - it DOES NOT accept null value as well
            - it DOES NOT accept duplicate values
         */
        Set<String> hashSet3 = new TreeSet<>();
        //hashSet3.add(null);
        hashSet3.add("Hello");
        hashSet3.add("9.99");
        hashSet3.add("400");
        hashSet3.add("hello");
        hashSet3.add("hello");
        hashSet3.add("$");
        System.out.println(hashSet3);

    }
}
