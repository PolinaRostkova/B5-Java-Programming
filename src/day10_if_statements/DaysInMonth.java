package day10_if_statements;

import java.util.Scanner;

/*
            create an int variable to represent the month number, where 1 is January and 12 is December.
        use the month number input to determine how many days are in that month.
        use the following data to help you determine the number of days in each month:

            Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
            Months that has 30 days: 4, 6, 9, 11
            Month that has 28 days: 2

            ex:
                12
                31 days

            ex:
                9
                3

   */
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a month number between 1-12 (inclusive): ");
        int monthFromUser = key.nextInt();

        boolean has31Days = monthFromUser==1||monthFromUser==3||monthFromUser==5||monthFromUser==7||monthFromUser==8||monthFromUser==10||monthFromUser==12;
        boolean has30Days = monthFromUser==4||monthFromUser==6||monthFromUser==9||monthFromUser==11;
        boolean has28days = monthFromUser==2;

        if (has31Days){
            System.out.println("This month has 31 days.");
        }
        if (has30Days){
            System.out.println("Has 30 days");
        }
        if (has28days){
            System.out.println("Has 28 days");
        } else {
            System.out.println("Number is invalid");
        }

        System.out.println("----------------------------------");

        if (has31Days){
            System.out.println("Has 31 days");
        } else if (has30Days) {
            System.out.println("Has 30 days");
        } else if (has28days) {
            System.out.println("Has 28 days");
        } else {
            System.out.println("Your number is invalid");
        }
    }
}
// if i want to check if something is true then do something otherwise do not do anything            ---> single if statements
// if i want to check if something is true then do something if it is false then do something else  ---> if else ( or 2 single if statements)
// if i want to check if condition 1 is true then do something and skip rest or if condition 2 is true then do something and skip rest or if condition..... ---> else if