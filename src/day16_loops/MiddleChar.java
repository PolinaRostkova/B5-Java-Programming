package day16_loops;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = key.nextLine();
        String middle = "";

        if (userInput.length() % 2 == 0){
            middle = userInput.substring(userInput.length()/2-1, userInput.length()/2+1);
            System.out.println(middle);
        } else {
            //middle = userInput.substring(userInput.length()/2, userInput.length()/2+1);
            middle = "" + userInput.charAt(userInput.length()/2);
            System.out.println(middle);
        }

    }
}
