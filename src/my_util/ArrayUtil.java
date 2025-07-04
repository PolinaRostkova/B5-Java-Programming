package my_util;

import java.util.Arrays;

public class ArrayUtil {
    /**
     * AThis method finds the minimum numver in Array
     * @param nums array we provide
     * @return int as a single number from array
     */
    public static int minNumInArr(int[] nums) {

        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        return numsCopy[0];
    }

    /**
     * Find the maximun value from the array
     * @param nums array provided
     * @return int with maximum number from array after sorting
     */
    public static int maxNumInArr(int[] nums) {

        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);
        return numsCopy[nums.length - 1];
    }


    /**
     * This method checks the given int array whether contains given num
     * @param nums given int array
     * @param num given int number
     * @return boolean if array contains number
     */
    public static boolean contains(int[] nums, int num){
        boolean result = false;

        for (int eachNum : nums){
            if (eachNum == num){
                result = true;
                break;
            }
        }

        return result;
    }

    /**
     * This method finds the index of the given num in int array nums array
     * @param nums is the given array
     * @param num is the given number to find the index of it
     * @return the index of the number in array
     */
    public static int indexOf(int[] nums, int num){
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num){
                index = i;
                break;
            }
        }
        return index;
    }
    /**
     * This method finds the index of the given word in String array
     * @param words is the given array
     * @param word is the given word to find the index of it
     * @return the index of the given word in array
     */
    public static int indexOf(String[] words, String word){
        int index = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)){
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * This method checks the given String array whether contains given word
     * @param words given String array
     * @param word given word
     * @return boolean if array contains word
     */
    public static boolean contains(String[] words, String word){
        boolean result = false;

        for (String eachElem : words){
            if (eachElem.equalsIgnoreCase(word)){
                result = true;
                break;
            }
        }

        return result;
    }

    /**
     * Calculates total of all elements
     * @param nums is the given int array
     * @return sum of all elements
     */
    public static int sumOfElems(int ... nums){
        int result = 0;

        for (int eachElem : nums){
            result += eachElem;
        }

        return result;
    }

    /**
     * This method adds one element to an array
     * @param num is given new elements
     * @param nums is the given int array
     * @return newArray with added elements at the end
     */
    public static int[] addElement2 ( int num, int ... nums){
        int[] newArr = Arrays.copyOf(nums, nums.length + 1);
        newArr[newArr.length - 1] = num;
        return newArr;
    }

    /**
     * This method adds a new String element to an existing array
     * @param word is the given element
     * @param strs is the given string
     * @return newString with added element in the end
     */
    public static String[] addElement2 ( String word, String ... strs){
        String [] newArr = Arrays.copyOf(strs, strs.length + 1);
        newArr[newArr.length - 1] = word;
        return newArr;
    }
}
