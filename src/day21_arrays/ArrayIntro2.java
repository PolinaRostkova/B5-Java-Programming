package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr1; // declared double array
        arr1 = new double[4]; // assigned value to array that will hold 4 elements

        //!!!! - With directly giving values we cannot declare and then give values
//        double arr2;
//        arr2 = {32.3, 78.9}

        double[] arr2 = {32.3, 78.9, 7}; // double can hold INT since double is bigger than int
        int[] arr3 = {(int)32.3, (int)78.9, 7}; // will work with explicit conversion but we loose data
        //int[] arr3 = {32.3, 78.9, 7}; gives an error without casting

        System.out.println(arr1.length); // 4
        System.out.println(arr1.length); // 2

        System.out.println();

        System.out.println(Arrays.toString(arr1)); // [0.0, 0.0, 0.0, 0.0] --> since we have made an array of 4 elements with no initial value it will show default values of this data type
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println();
        //q: once i made an array and declared that it can hold 4 elements, now i want to assign values those locations
        //[0.0, 0.0, 0.0, 0.0]

        arr1[0] = 45.6;
        arr1[1] = 77;
        System.out.println(Arrays.toString(arr1));

        double price = 0.99;
        int quantity = 4;

        arr1[2] = price * quantity;
        System.out.println(Arrays.toString(arr1));

        arr1[3] = 99.9;
        System.out.println(Arrays.toString(arr2));

//        arr1[4] = 34.5; --> .ArrayIndexOutOfBoundsException
//        System.out.println(Arrays.toString(arr2));

        //q: how can i get the last element in array?


        System.out.println( arr1[arr1.length-1]);

        //q: how can re-assign a new value 44.2 to last index of arr1

         arr1[arr1.length-1] = 44.2;
        System.out.println(Arrays.toString(arr1));

        System.out.println();
        arr1 =new double[5]; // re-assigned to a new array which has 5 locations in it. and we lost access to out previous arr1 so it is not reachable anymore
        System.out.println(arr1);

        //assign 5.2 to the last element
        arr1[arr1.length-1] = 5.2;

        System.out.println(Arrays.toString(arr1));

    }
}

/*
    Default values of dataTypes in array
    		int --- > 0
			double --- > 0.0
			object --- > null  |  non-primitive data types - (String)
			boolean --- > false
			char  --- > ‘\u0000’

 */
