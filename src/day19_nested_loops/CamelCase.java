package day19_nested_loops;
/* Camel Case

            Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

            Ex:

                Today is SUNDAY

                Output:

                todayIsSunday

 */

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a sentence with multiple words: ");
        String userSentence = key.nextLine().trim().toLowerCase();

        /*
        find the space and take the next char and make it UpperCase
        all the rest has to be lower case
         */

        //OPTION 1
        String camelCaseVersion = "";
        //  today is sunday --- > todayIsSunday
        //  012345678901234
        for (int i = 0; i < userSentence.length(); i++) {
            if (userSentence.charAt(i) == ' '){
                camelCaseVersion += ("" + userSentence.charAt(i + 1)).toUpperCase();
                i++;
            } else {
                camelCaseVersion += userSentence.charAt(i);
            }
        }
        System.out.println(camelCaseVersion);

        System.out.println("--------------------------------------------");

        // OPTION 2
        String camelCaseVersion2 = userSentence.charAt(0)+"";  // today_Is_Sunday

        //  today is sunday --- > todayIsSunday
        for (int i = 1; i < userSentence.length(); i++) {

            if (userSentence.charAt(i-1) == ' '){ // t == ' '
                camelCaseVersion2 += (""+userSentence.charAt(i)).toUpperCase();
            } else {   //  012345678901234

                camelCaseVersion2 += userSentence.charAt(i);
            }

        }

        System.out.println(camelCaseVersion2.replace(" ", ""));
    }
}
