package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userSentence = key.nextLine();

        userSentence = userSentence.toLowerCase();
        //Get the first and last character (ignoring case sensitiveness)
        char firstCharacter = userSentence.charAt(0);
        char lastChar = userSentence.charAt(userSentence.length() - 1);

        System.out.println("First char: " + firstCharacter);
        System.out.println("Last char : " + lastChar);

        if (firstCharacter == lastChar){
            System.out.println("Char are same");
        } else {
            System.out.println("Different");
        }
        //todo: check if last 2 characters are same or not ? -- loop

    }
}
