package day16_loops;

import java.util.Scanner;

/*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
 */
public class MoveFirst {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String  sentence = key.nextLine();

        String sentencePart1 = sentence.substring(sentence.indexOf(" ")).trim() +" " +  sentence.substring(0,sentence.indexOf(" "));
        System.out.println( sentencePart1);
    }
}
