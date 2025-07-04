package day26_methods;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};

        int[] nums2 = addElement(nums, 89);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));

        System.out.println("-------------------");


    }

    // create a method which adds a given numbers into an array
    public static int[] addElement(int[] nums, int num){
        int[] newArr = Arrays.copyOf(nums, nums.length + 1);
        newArr[newArr.length - 1] = num;
        return newArr;
    }

    // create a method which adds a given numbers into an array - var args
    public static int[] addElement2 ( int num, int ... nums){
        int[] newArr = Arrays.copyOf(nums, nums.length + 1);
        newArr[newArr.length - 1] = num;
        return newArr;
    }

}
