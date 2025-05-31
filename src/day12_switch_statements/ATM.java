package day12_switch_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int correctPin = 2222;
        double balance = 100_000.00;

        System.out.print("\n\tWelcome to ATM\n\tPlease, insert your card \n\tPlease enter your PIN: ");
        int userInputPIN = keyboard.nextInt();

        // check if the pin is 4 digits
        if (userInputPIN < 1000 || userInputPIN > 9999){
            System.out.println("You entered lees or more than 4 digits PIN. ");
        } else {
            if (userInputPIN == correctPin){
                System.out.println("\n\tYou are logged in!");
                System.out.println("\t\tSelect one of the options below: ");
                System.out.println("\t\t\t1 - Check balance");
                System.out.println("\t\t\t2 - Deposit Money");
                System.out.println("\t\t\t3 - Withdraw Money");
                System.out.println("\t\t\t4 - Exit");
                System.out.print("\t\t\tYour choice (1 - 4): ");
                int userChoice = keyboard.nextInt();

                if (userChoice < 1 || userChoice > 4){
                    System.out.println("\n\tWrong choice! Valid are between 1 - 4. ");
                } else {
                    if (userChoice == 1){
                        System.out.println("\t\t\t\tYour balance is: $"+ balance);
                    } else if (userChoice == 2){
                        System.out.print("\t\t\t\tEnter the amount you want to deposit: ");
                        balance += keyboard.nextDouble();
                        System.out.println("\t\t\t\tYor new balance: " + balance);
                    } else if ( userChoice == 3) {
                        System.out.print("\t\t\t\tEnter amount you want to withdraw: ");
                        double userWithdraw = keyboard.nextDouble();
                        if (userWithdraw > balance){
                            System.out.println("\t\t\t\tYou don't have enough money to withdraw that amount");
                        } else {
                            balance -= userWithdraw;
                            System.out.println("\t\t\t\tYour new balance is: $"+balance);
                        }
                    } else {
                        System.out.println("\n\t\t\tThanks for the visit. your money is in safe hands. Bye!");
                    }
                }
            } else {
                System.out.println("\n\tWrong PIN!");
            }
        }
    }
}
