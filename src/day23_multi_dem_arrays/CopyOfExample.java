package day23_multi_dem_arrays;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println();
        arr1[0] = 5;
        arr2[1]= 10;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println();
        int[] arr3 = new int[arr1.length]; // created a new array with 3 locations but we have {0,0,0} here

        for (int i = 0; i < arr1.length; i++) {
           arr3[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println();

        arr1[2] = 40;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // If I want to make my original array size bigger - additional 3 elements
        // int [] arr1 = {1,2,3} --> {1,2,3,_,_,_...}

        int[] arr4 = new int[arr1.length + 3]; // [1, 2, 3, _, _, _]

        for (int i = 0; i < arr1.length; i++) {
            arr4[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr4));

        System.out.println("----------------------------");
        int[] arr5 = Arrays.copyOf(arr1,arr1.length+3);

        System.out.println("----------------------------");

        int[] arr6 = Arrays.copyOf(arr1, arr1.length-1);

    }
}
