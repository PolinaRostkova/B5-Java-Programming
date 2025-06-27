package day23_multi_dem_arrays;

import java.util.Arrays;

public class BinarySearchEx {
    public static void main(String[] args) {
        int[] arr = {4, 55, 4, 10, -1, 30, 100, 150};
        //           0   1  2   3   4   5   6    7
        System.out.println(Arrays.toString(arr) );
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 100));
        System.out.println(Arrays.binarySearch(arr, -1));
        System.out.println(Arrays.binarySearch(arr, 200)); // if does NOT exist will be negative

        System.out.println("------------------------------------------");
        Arrays.sort(arr);

        //binarySearch method works  correctly when all the elements are sorted 
        System.out.println( Arrays.toString(arr) );
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 100));
        System.out.println(Arrays.binarySearch(arr, -1));
        System.out.println(Arrays.binarySearch(arr, 200)); // if does NOT exist will be negative

        System.out.println("-----------------------");
        int [] arr2 = { 4, 55, 4, 10, -1, 30, 100, 150};
        //              0   1  2   3   4   5   6    7
        int num = 110;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == num){
                System.out.println("Index of " + num + " is: " + i );
                break;

            } else if ( (i+1) == arr2.length  ) {
                System.out.println("There was no match");
            }
        }

    }
}
