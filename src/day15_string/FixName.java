package day15_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your firs name: ");
        String userFirstName = key.next();

        System.out.print("Enter your last name: ");
        String userLastName = key.next();

        System.out.println("------------------------------------------------");

        System.out.println("Your Full Name (before fix: " + userFirstName +" "+userLastName);
        System.out.println("Changes: ");
        userFirstName = "" +userFirstName.toUpperCase().charAt(0) + userFirstName.substring(1).toLowerCase();
        userLastName = "" + userLastName.toUpperCase().charAt(0) + userLastName.substring(1).toLowerCase();
        System.out.println("Result so far: " + userFirstName + " " + userLastName);

    }
}
