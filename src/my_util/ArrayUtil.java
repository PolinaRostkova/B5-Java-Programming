package my_util;

import java.util.Arrays;

public class ArrayUtil {
    /**
     * AThis method finds the minimum numver in Array
     * @param nums array we provide
     * @return int as a single number from array
     */
    public static int minNumInArr(int[] nums) {

        Arrays.sort(nums);
        return nums[0];
    }

    /**
     * Find the maximun value from the array
     * @param nums array provided
     * @return int with maximum number from array after sorting
     */
    public static int maxNumInArr(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
}
