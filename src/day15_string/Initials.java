package day15_string;

import java.util.Scanner;

/*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */
public class Initials {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String userName = key.next().toUpperCase().trim();
        key.nextLine();
        System.out.print("Enter your last name: ");
        String UserLastName = key.nextLine().toUpperCase().trim();

        char firstNameInitials = userName.charAt(0);
        char lastNameInitials = UserLastName.charAt(0);

        System.out.println("" + firstNameInitials + lastNameInitials);
    }
}
