package day11_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int correctPinCode = 9876;
        int correctSsnLast4 = 3633;

        System.out.print("Welcome to ATM.\n\tPlease, enter your pin: ");

        int userInputCode = key.nextInt();

        System.out.print("\tPlease, enter last 4 digits of your SSN: ");
        int userSSN = key.nextInt();

        if (correctPinCode == userInputCode && correctSsnLast4 == userSSN){
            System.out.println("Authentication successful. You are logged in. ");
        }else {
            //System.out.println("You gave me invalid input");
            if (correctPinCode != userInputCode&&correctSsnLast4!=userSSN){
                System.out.println("Both PIN and SSN are incorrect.");
            }else if (correctPinCode != userInputCode){
                System.out.println("Your PIN is incorrect.");
            } else if (correctSsnLast4!=userSSN) {
                System.out.println("You gave me incorrect SSN.");
            }
        }
    }
}
