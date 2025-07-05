package day27_wrapper_arrayList;

import java.util.ArrayList;

public class RemoveEx {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        System.out.println(arrList);

        System.out.println("---------------------------------------------------");

        // arrList.add(10); / invalid we cant add integer
        // arrList.add(10+"") // we can concatenate and add

        arrList.add("java");
        arrList.add("bread");
        arrList.add("water");
        arrList.add("banana");
        System.out.println(arrList); // INSERTION ORDER is KEPT. ArrayList is ORDERED | [java, bread, water, banana]
        arrList.add(0, "butter");
        System.out.println(arrList);

        System.out.println("---------------------------------------------------");

        // how can i remove the element
        // .remove(byIndex)

        arrList.remove(0);
        System.out.println(arrList);

        System.out.println("---------------------------------------------------");

        // remove the last element
        arrList.remove(arrList.size() - 1);
        System.out.println(arrList);

        System.out.println("---------------------------------------------------");

        arrList.add("java");
        arrList.add("API");
        arrList.add("softskills");
        arrList.add("db");
        arrList.add("aws");
        System.out.println(arrList);

        System.out.println("---------------------------------------------------");

        // how can i remove element by element
        // .remove(byObject) --> removes the element from the ArrayList by the object at the first match

        arrList.remove("java");
        System.out.println(arrList);

        arrList.remove("soft-skills"); // returns boolean
        System.out.println(arrList.remove("softskills"));
        System.out.println(arrList);

    }
}
