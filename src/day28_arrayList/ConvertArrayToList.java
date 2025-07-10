package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        // array can hold primitive and non-primitive
        int[] arr1 = {1,2,3,4,5,6,7,8,9}; // holds primitive data type
        Integer[] arr2 = {1,2,3,4,5,6,7,8,9}; // hold object data type

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);
        nums1.add(6);
        nums1.add(7);
        nums1.add(8);
        nums1.add(9);

        System.out.println(Arrays.toString(arr1)); // primitive arr
        System.out.println(Arrays.toString(arr2)); // non-primitive arr
        System.out.println(nums1);                 // arrayList

        System.out.println("-----------------------------------------------");
        // ArrayList<Integer> numArrList1 = Arrays.asList(arr1);

        //ArrayList<Integer> numArrList1 = new ArrayList<>(Arrays.asList(arr1)); // cant assign directly like this because of the primitive data type in arr1 (int)

        // ArrayList<Integer> numArrList2 = Arrays.asList(arr2);
        ArrayList<Integer>  numArrList2 = new ArrayList<>(Arrays.asList(arr2)); // it works because data type in arr2 is non-primitive Integer
        // here we are converting Integer Array into ArrayList of Integer

        // We added all the elements into the ArrayList st the declaration usinf asList method from Arrays class which helps to convert Array into ArrayList
        ArrayList<Integer> numArrList3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(numArrList2);
        System.out.println(numArrList3);

        System.out.println("-----------------------------------------------");

        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("java", "jira", "softskills", "mentors"));
        System.out.println(list4);
    }
}
