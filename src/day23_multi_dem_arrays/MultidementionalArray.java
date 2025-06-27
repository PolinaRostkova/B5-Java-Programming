package day23_multi_dem_arrays;

import java.util.Arrays;

public class MultidementionalArray {
    public static void main(String[] args) {

        int[] a = {5, 10, 20, 10};          //Single dimensional Array
        int[] b = {5, 10, 30, 40,50, 23};   //Single dimensional Array

        int[][] twoDemArr = {a, b};              // Two-Dimensional Array
        int[][] twoDemArr2 = {{32, 345, 2, 354}, {432, 5, -1, 345, -234, 45}};

        //Printing Single Dimensional Arrays
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("------------------------");

        //Printing Two-Dimensional Array
        System.out.println(twoDemArr); // will show memory location
        System.out.println(Arrays.toString(twoDemArr));   // will still show memory location
        System.out.println(Arrays.toString(twoDemArr2));  // will still show memory location

        System.out.println(Arrays.deepToString( twoDemArr));  // [[5, 10, 20, 10], [5, 10, 30, 40, 50, 23]]
        System.out.println(Arrays.deepToString( twoDemArr2)); // [[32, 345, 2, 354], [432, 5, -1, 345, -234, 45]]

        System.out.println("------------------------");

        int[] c = new int[4]; // Single Dimensional Array declaration

        int[][] twiDimArr3 = new int[3][];  // this 2 Dimensional Array will hold 3 Single Dimensional Arrays of any size

        int [] arr1 = {1,2,3};
        twiDimArr3[0] = arr1;
        int[] arr2 = {1,2,3,4,5,6};
        twiDimArr3[1] = arr2;
        int[] arr3 = {1,2};
        twiDimArr3[2] = arr3;

        System.out.println(Arrays.deepToString( twiDimArr3));

        System.out.println("------------------------");

        int[][] twoDimArr4 = new int[3][2]; // this 2 Dimensional Array will hold 3 Single Dimensional Arrays of size 2
        int[] arr4 = {1,2};
        twoDimArr4[0] = arr4;
        int[] arr5 = {1,2,3}; //
        twoDimArr4[1] = arr5;
        System.out.println(Arrays.deepToString( twoDimArr4));

        System.out.println();
        int[] arr6 = {1,2};
        System.out.println(arr6[1]);

        int[][] twoDimArr7 = {
                {12,45,65},          //Single Dimensional Array
                {453, 4563},         //Single Dimensional Array
                {54, 67,87, 9876}    //Single Dimensional Array
        };

        System.out.println(Arrays.toString(twoDimArr7[1]));
        System.out.println( twoDimArr7[1][1] );
        System.out.println( twoDimArr7[2][3] );

        twoDimArr7[0][2]= 56;



    }
}
