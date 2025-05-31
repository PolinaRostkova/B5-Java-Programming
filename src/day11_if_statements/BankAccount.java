package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declare 2 double var
        double balance;
        double withdraw;

        System.out.print("What is your balance: ");
        balance = scanner.nextDouble();

        System.out.print("How much money you want to withdraw: ");
        withdraw = scanner.nextDouble(); //200

        if (balance < withdraw){
            System.out.println("Not Enough Money");
        } else {
            balance -=withdraw;
            System.out.println("Your new balance is: "+balance);
        }

        //balance -=withdraw;
       // System.out.println("Your new balance is: "+balance);

        // lets say now i want to withdraw more than i have on my balance
        // i want to withdraw 200
        /*
        if withdraw is bigger than balance --> print "Not enough balance"
        otherwise allow withdrawing and update the balance anf print "Your new balance is: balance"
         */

    }
}
