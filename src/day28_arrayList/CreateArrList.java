package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class CreateArrList {
    public static void main(String[] args) {

        // Create an empty arrList of String and add elements one by one

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Monday");
        list1.add("Tuesday");
        System.out.println(list1);

        // Create an arrList and give directly the initial values at the declaration
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Monday", "Tuesday"));
        System.out.println(list2);

        System.out.println("------------------------------------");
        ArrayList<String> list3 = list1; // we did not create a NEW array object, we just point to the same object as the list1 is pointing
        System.out.println(list3);

        System.out.println("------------------------------------");
        list1.set(0, "MON");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        System.out.println("------------------------------------");

        ArrayList<String> list4 = new ArrayList<>(list2); // created a new list onbject and copuing the list2. is we do changes in list2 it affects only list2
        list2.set(0, "M");
        System.out.println(list2);
        System.out.println(list4);
    }
}
