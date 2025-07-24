package my_util;

import java.util.ArrayList;

public class StringUtil {
    /**
     * This method fixes the format of the word
     * @param word is the given string
     * @return fixed format - 1st letter Upper and rest is Lower Case
     */
    public static String fixFormat (String word){

        String fixed = "";

        fixed = ("" + word.charAt(0)).toUpperCase() + word.substring(1).toLowerCase();
        return fixed;
    }

    /**
     * This method counts the letter appearance in word
     * @param word is a given word
     * @param letter is a given letter we need to count
     * @return count of char in String
     */
    public static int frequencyOfChar(String word, char letter){ // order of data meters when you are passing it

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }

    /**
     * This method returns the single characters of each character in String
     * @param word string that needs to be passed
     * @return String of unique characters
     */
    public static String uniqueChars(String word){
        String uniqueChars = "";
        char[] wordArr = word.toCharArray();

        for (char eachChar : wordArr){
            if (!uniqueChars.contains("" + eachChar)){
                uniqueChars += eachChar;
            }
        }
        return uniqueChars;
    }

    /**
     * This method reverse the given string
     * @param str is the given string
     * @return the reversed string
     */
    public static String reverse(String str){
        String reversed = "";
        for (int i = str.length() -1 ; i >= 0 ; i--) {

            reversed += str.charAt(i);
        }


        return reversed;
    }

    public static String htmlGenerator(String str){
        String result = "";

        int indexOfDevider = str.indexOf("^");
        int cycle = Integer.parseInt(str.substring(indexOfDevider + 1));
        String text1 = str.substring(0, indexOfDevider);

        for (int i = 1; i <= cycle ; i++) {
            result = "<" + text1 + "></" + text1 + ">";
        }

        return result;
    }

    /**
     * This method fixes the format of the word
     * @param word is the given string
     * @return fixed format - 1st letter Upper and rest is Lower Case
     */
    public static String fixFormatForFullName (String word){

        String[] words = word.split(" ");
        String fullName = "";
        for (String each : words){
            fullName += ("" + each.charAt(0)).toUpperCase() + each.substring(1).toLowerCase() + " ";
        }

        return fullName.trim();
    }
    //todo: add a reusable method for duplicate letters (String str)
}
