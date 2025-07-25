package day31_custom_class_cont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Keep Uniques / Remove Duplicates
    Create a method that will take an ArrayList of numbers and remove any duplicates values.
    The method will return an ArrayList of unique elements.

    @param nums - The given ArrayList of numbers @return - ArrayList of numbers

        Ex:
        Input: {1, 3, 5, 1, 4, 5, 9};
        Output: {3, 4, 9};
 */
public class KeepUniques {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println("Original: " + nums);
        System.out.println("Uniques:  " + keepUnique(nums));
    }

    public static ArrayList<Integer> keepUnique(ArrayList<Integer> list){
        ArrayList<Integer> listUnique = new ArrayList<>();

        for(Integer each : list){
            if(Collections.frequency(list, each) == 1){
                listUnique.add(each);
            }

        }
        return listUnique;
    }
}
/*
todo: homework --> String str = "vnslursdfsbrs";
 using collections knowledge create a method that finds unique characters and removes duplicate characters
 using collections knowledge create a method that finds duplicate (more that 1) characters

 Ex:  String str = "vnslursdfsbrs"
    1) ['v', 'n', 'l', 'u', 'd', 'f', 'B']
    2) ['s', 'r']
 */