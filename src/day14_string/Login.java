package day14_string;

import java.util.Scanner;

/*

    Ask the user to enter a username


    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */
public class Login {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        String validUserName = "loopcamp";
        String correctPassword = "Loop Batch#5";

        System.out.print("Please, enter your user name: ");
        String inputUserName = keyboard.next();

        keyboard.nextLine();
        System.out.print("Please, enter your password: ");
        String inputUserPassword = keyboard.nextLine();

        if (validUserName.equalsIgnoreCase(inputUserName) && correctPassword.equals(inputUserPassword)){
            System.out.println("You have successfully logged in!");
        } else {
            if (!validUserName.equalsIgnoreCase(inputUserName)) {
                System.out.println("User name is not correct");
            } if (!correctPassword.equals(inputUserPassword)){
                System.out.println("Incorrect password");
                if (inputUserPassword.length() < 8){
                    System.out.println("Password has less than 8 characters");
                }
            }



        }
    }
}
