package day25_methods_void_and_return;

import java.util.Arrays;

public class MinAndMaxNum {
    public static void main(String[] args) {

        int[] numbers = {3, 65, 12, 124, 765, 23, 675, -1};
        System.out.println(minNumInArr(numbers));
        System.out.println(maxNumInArr(numbers));
    }
    // create a method that finds a min from array
    public static int minNumInArr(int[] nums) {

        Arrays.sort(nums);
        return nums[0];
    }

    public static int maxNumInArr(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
}
