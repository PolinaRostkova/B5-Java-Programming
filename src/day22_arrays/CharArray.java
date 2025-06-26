package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        String word = "loopcamp";

        System.out.println("Size of the word: " + word.length());
        System.out.println("Word: " + word);

        System.out.println("------------------------");

        char[] letters = {'l', 'o', 'o', 'p', 'c', 'a', 'm', 'p'} ;
        System.out.println("size of char array: " + letters.length);
        System.out.println(letters); // works only with char array
        System.out.println("" + letters); // prints memory location

        System.out.println("------------------------");

        char[] wordInArr = new char[word.length()]; // [_, _, _, _, _, _, _, _] --> i want to store this many characters

        for (int i = 0; i < wordInArr.length; i++) {
            wordInArr[i] = word.charAt(i);
        }

        System.out.println(Arrays.toString(wordInArr));

        System.out.println("------------------------");

        char[] wordInArr2 = word.toCharArray();
        System.out.println(Arrays.toString(wordInArr2));

        System.out.println("------------------------");

        // converting string into char array
        char[] charArr = "Wednesday".toCharArray();
        System.out.println(Arrays.toString(charArr));

        // converting char array into string (just string)
        char [] charArr2 = {'J', 'a', 'v', 'a'}; // [J, a, v, a]
        String str1 = Arrays.toString(charArr2);
        System.out.println(str1);

        String str2 = new String(charArr2); // creates a new element "Java" string
        System.out.println(str2);


    }
}
