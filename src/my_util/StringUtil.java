package my_util;

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
}
