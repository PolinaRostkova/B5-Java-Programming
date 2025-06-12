package day16_loops;

import java.util.Scanner;

public class LongestLenghtWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 words: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        if (word1.length()>word2.length() && word1.length()>word3.length()&&word2.contains("a")&&word3.contains("a") && word1.contains("a")){
            System.out.println(word1);
        } else if (word2.length()>word3.length() && word2.length()>word1.length() && word3.contains("a") && word1.contains("a") && word2.contains("a")) {
            System.out.println(word2);
        } else if (word3.length()>word1.length() && word3.length()>word2.length()&& word1.contains("a") && word2.contains("a") && word3.contains("a")) {
            System.out.println(word3);
        }
    }
}
