package day21_arrays;

import java.util.Scanner;

/*
    Ask the user the month number they want, print the month name

    1 --> January

    12 --> December

    Assume only valid numbers are given, but as a challenge you can handle invalid numbers
 */
public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you the name of the month: ");
        int userMonthNum;
        String [] month = {"January", "February", "Match", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        do {
            System.out.print("Enter: ");
            userMonthNum = input.nextInt();

            if (userMonthNum >= 1 && userMonthNum <= 12){
                System.out.println(month[userMonthNum-1]);
            }

        } while (userMonthNum < 1 || userMonthNum > 12);

    }
}
