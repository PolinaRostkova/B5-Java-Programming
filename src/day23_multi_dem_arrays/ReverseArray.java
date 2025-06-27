package day23_multi_dem_arrays;

import java.util.Arrays;

/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
        [1, 2, 3, 4, 5]
    Output:
        [5, 4, 3, 2, 1]

 */
public class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        int[] reversed = new int[nums.length]; // [_, _, _, _, _]

        for (int i = nums.length-1; i >= 0 ; i--) {

            reversed[(nums.length - 1) - i] = nums[i];
        }

        System.out.println("Original: " + Arrays.toString(nums));
        System.out.println("Reversed: " + Arrays.toString(reversed));

        System.out.println("----------------------------");
        // {1, 2, 3, 4, 5};
        int[] reversed2 = new int[nums.length];

        for (int i = nums.length - 1, j = 0 ; i >= 0; i--, j++) {
            reversed2[j] = nums[i];
            // i = 4 - 3 - 2 - 1 - 0
            // j = 0 - 1 - 2 - 3 - 4
        }

        System.out.println("Reserved2: " + Arrays.toString(reversed2));

    }
}
