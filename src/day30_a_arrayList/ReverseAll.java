package day30_a_arrayList;

import my_util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAllInList(list));
    }

    public static ArrayList<String> reverseAllInList(ArrayList<String> list){
        ArrayList<String> listCopy = new ArrayList<>(list);
        ArrayList<String> reversedList = new ArrayList<>();
        for (String eachElement : listCopy){
            // we called oyr reverse utility method from our StringUtil class
            reversedList.add(StringUtil.reverse(eachElement));
        }
        return reversedList;
    }
}

/*
// here we coded it again, but we have reusable method in our StringUtil class
 public static ArrayList<String> reverseList(ArrayList<String> list){
        ArrayList<String> reverseList = new ArrayList<>();
        for (String eachWord  : list){
            String reverseWord = "";
            for (int i = eachWord.length() - 1 ; i >= 0 ; i--) {
                String eachChar = "" + eachWord.charAt(i);
                reverseWord += eachChar;
            }
            reverseList.add(reverseWord);
        }
        return reverseList;
 */
