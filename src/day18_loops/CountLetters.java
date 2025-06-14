package day18_loops;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        //Scanner key = new Scanner(System.in);

        String str = "aabbcaa";
        char letter = 'c';
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                counter++;
            }
        }

        System.out.println("You have " + counter + " " + "letter " + letter );
    }
}
