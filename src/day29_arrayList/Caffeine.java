package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(); // created arrList of String and it is Empty
        list1.add("coffee");
        list1.add("soda");
        list1.add("tea");
        list1.add("energy drinks");
        System.out.println(list1);

        ArrayList<String> list2 = list1; // not created a new ArrayLis of String - just pointing ti the same one
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>(list1); // created a new ArrayList of String by copying the list1
        System.out.println(list3);

        System.out.println("-----------------");
        list1.remove("soda");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        System.out.println("-----------------");
        list2.remove("energy drinks");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        System.out.println("-----------------");

        String [] arr = {"Soda" , "Tea", "Coffee"};
        //ArrayList<String> list4 = arr; | invalid is declaration
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList(arr)); // this is correct

        System.out.println("-----------------");
        // BULK OPERATIONS
        System.out.println("BULK OPERATIONS");
        // .addAll();
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("soda");
        list5.add("tea");
        list5.add("coffee");
        list5.add("energy drinks");

        //list1.addAll("soda", "tea", "coffee", "energy drinks") | not valid - because we need to provide collection type data
        list5.addAll(Arrays.asList("soda", "tea", "coffee", "energy drinks"));
        System.out.println(list5);
        list5.add("milkshake");
        System.out.println(list5);
        list5.addAll(Arrays.asList("mocha", "hot chocolate"));
        System.out.println(list5);

        list5.addAll(0, Arrays.asList("chai latte", "hot chocolate"));
        System.out.println(list5);
    }
}

/*
ArrayList:
    - size is flexible
    - keeps insertion order
    - allows duplicate element
    - has indexes
    - internally uses Array
 */
