package day14_string;
/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
        .io

      in cases it is not valid, tell the reason why

 */
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter a website: ");
        String websiteURL = key.next();
        websiteURL = websiteURL.toLowerCase(); // here we are avoiding the case sensitiveness

        boolean hasValidBeginning = websiteURL.startsWith("www");
        boolean hasValidEnding = websiteURL.endsWith(".com") || websiteURL.endsWith(".edu") || websiteURL.endsWith(".gov") || websiteURL.endsWith(".net") || websiteURL.endsWith(".io");


        if (hasValidBeginning && hasValidEnding){
            System.out.println("It is valid website");
        } else {
            System.out.println("Not valid website URL");
            if (!hasValidBeginning){
                System.out.println("Beginning is NOT correct");
            } if (!hasValidEnding){
                System.out.println("Ending is NOT correct");
            }
        }
    }
}
