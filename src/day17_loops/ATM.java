package day17_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int validPinCode = 9876;
        int userEnterPinCode;
        int attemptcount = 3;

        System.out.println("Welcome to ATM");

        do {
            System.out.print("Enter your PIN code:");
            userEnterPinCode = key.nextInt();

            attemptcount--;

            if (userEnterPinCode != validPinCode && attemptcount != 0){
                System.out.println("Try again");

            }
        }while (userEnterPinCode != validPinCode && attemptcount > 0);

        if (attemptcount == 0 && userEnterPinCode != validPinCode){
            System.out.println("You have tried 3 times and you are locked out. Please. call us!");
        } else{
            System.out.println("You are successfully logged in");
        }
    }
}
