package day15_string;

import java.util.Scanner;


public class Filter {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a message: ");
        String userMessage = key.nextLine().trim();

        System.out.println("Your message: " + userMessage);
        userMessage = userMessage.toLowerCase();

        boolean hasBadWords = userMessage.contains("bad") ||
                userMessage.contains("quit") ||
                userMessage.contains("have fun") ||
                userMessage.contains("crying");
        if (hasBadWords){
            System.out.println("Message failed to send");
        } else {
            System.out.println("\"" + userMessage + "\" was sent!");
        }



        //System.out.println("=================================");
        //System.out.println("Your message: " + userMessage);
    }
}
