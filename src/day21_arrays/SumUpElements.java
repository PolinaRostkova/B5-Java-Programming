package day21_arrays;

import java.util.Arrays;

public class SumUpElements {
    public static void main(String[] args) {
        int[] nums = {3, 6, 10};
        System.out.println("Size of array: " + nums.length);
        System.out.println("Getting elements: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
        System.out.println("Getting elements other way: " + Arrays.toString(nums).replace("[", "").replace("]", ""));

        System.out.println("--------------------------------------------------");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("--------------------------------------------------------");
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }

        System.out.println("Sum of all: " + result);

    }
}
