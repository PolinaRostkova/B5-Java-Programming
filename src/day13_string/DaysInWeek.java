package day13_string;

import java.util.Scanner;

/*
    Given a day number, find and print the day related to the number

    1- Monday
    2- Tuesday

    6- Saturday
    7- Sunday

    any other number: Not a day
 */
public class DaysInWeek {
    public static void main(String[] args) {

        // created a scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a number that represents day of the week (between 1-7): ");
        int userInput = scan.nextInt();

        switch (userInput){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a day.");
        }

    }
}
