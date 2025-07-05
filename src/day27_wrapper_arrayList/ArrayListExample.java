package day27_wrapper_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        // data structure - it is a container that holds the data in a specific structured way

        int a = 45; // this is not a data structure. It is local container (variable) that holds s SINGLE data
        int[] arr = {12, 34, 2345}; // this is array data structure which holds multiple data of same data type
        Integer[] arr2 = {23, 54, 345}; // array data structure works with both Primitive andNon-Primitive data types. Size is fixed. Also has indexes

    /*
        Note: All other data structures in Java only works with OBJECT type (Non-Primitive)
        Array List:
            - works only with OBJECT type (Non-Primitive). Does not work with primitive
            - Size is flexible (changeable). Not fixed like Array
            - comes from java.util.package
     */

        //ArrayList <int> arrayList;  | arrayList collection data structure is not supporting the Primitive data type
        ArrayList <Integer> arrayList2;

        //System.out.println(arrayList2);

        ArrayList <Integer> arrayList = null; // created ArrayList of integer reference with no actual object yet being null
        System.out.println(arrayList); // null

        ArrayList<Integer> arrayList3 = new ArrayList<>(); // i created Array List of Integer with actual object being empty
        System.out.println(arrayList3); // []

        // No one uses | ArrayList<Integer> arrayList4 = new ArrayList<>(10); // creating Array List of Integer with initial capacity by 10



        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // size();
        //System.out.println(arrayList.size()); // NullPointerException --> since it is not an actual object
        System.out.println(arrayList3.size()); // [] --> returns 0

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // How can i add elements in ArrayList
        //.add(elements/data); - adds the given element to the end
        //arrayList.add(10); // NullPointerException --> for this one we did NOT created an object we will get thi exeprion
        arrayList3.add(10);
        System.out.println(arrayList3);
        System.out.println(arrayList3.size());

        arrayList3.add(20);
        System.out.println(arrayList3);

        arrayList3.add(30);
        System.out.println(arrayList3); // [10, 20, 30]
        //   index                           0   1   2

        //How can i get the element
        //.get(index);
        System.out.println(arrayList3.get(0));
        System.out.println(arrayList3.get(1));
        System.out.println(arrayList3.get(2));

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        //How can i add the elements on the exact index? - ex: add -10 at index 1
        // [10, 20, 30]
        // . add(index, element/data); ---> add the given element to the given index in side of the list and pushes all other to right side

        arrayList3.add(1, -10);
        System.out.println(arrayList3); //[10, -10, 20, 30]
        System.out.println(arrayList3.size());

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        // can you get me get the last element in the list
        System.out.println(arrayList3.get(arrayList3.size()-1));

        // can you get me get the first element in the list
        System.out.println(arrayList3.get(0));

        arrayList3.add((int) 23.7); // double --> int --> AUTOBOXING ---> Integer
        System.out.println(arrayList3);


    }
}

/*
    Array List methods:
            .size();
            .add(element);
            .add(index, element/data);
            .get(index);
            .isEmpty()
            .contains()
            .remove(byObject)
            .remove(byIndex)
 */
