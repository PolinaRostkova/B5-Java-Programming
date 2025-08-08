package day41_collection.List;

import java.util.*;

public class ListObjects {
    public static void main(String[] args) {
        /*
            ArrayList<String> list1 = new ArrayList<>();    / reference is itself
            List<String> list2 = new ArrayList<>();         / reference is Parent interface List
            Collection<String> list3 = new ArrayList<>();   / Reference: "Parent" interface collection
            Iterable<String> list4 = new ArrayList<>();     / Reference: "Parent" interface of collection
         */


        /*
        ArrayList
            - internally using dynamic arrays
            - Insertion order is kept (objects follow as we add them)
            - adding / removing elements makes the process slower since it is using indexes in the background
            - reading / getting element faster since it works with indexes
            - it accepts null value as well
            - it accepts duplicate values
         */
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        System.out.println(list1.get(0));
        System.out.println(list1);

        System.out.println("===================================");
        /*
        LinkedList
            - internally using pointers
            - Insertion order is kept (objects follow as we add them)
            - adding / removing elements makes the process faster since it is using pointers in the background
            - reading / getting element is slower because it goes one by one and starts from the beginning
            - it accepts null value as well
            - it accepts duplicate values
         */
        List<String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        System.out.println(list2.get(0));
        System.out.println(list2);

        System.out.println("===================================");
        /*
        Vector
            - internally using dynamic array
            - Insertion order is kept (objects follow as we add them)
            - it accepts null value as well
            - it accepts duplicate values
            - it is synchronized/thread safe (cannot reach the same object from the different place at the same time)
         */
        List<String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        System.out.println(list3.get(0));
        System.out.println(list3);

    }
}
