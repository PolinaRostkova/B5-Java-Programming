package day10_if_statements;

import java.util.Scanner;

/*
 Declare and assign a number (day)

         1 - Monday
         2 - Tuesday
         ..
         6 - Saturday
         7 - Sunday

         Ex: 2
             Tuesday

             // website: ww.google.com
 */
public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number between 1 - 7 (including): ");

        int weekDauInNumber = key.nextInt();
        // below we have 7 single IF statements
        if (weekDauInNumber == 1){
            System.out.println("Monday");
        }

        if (weekDauInNumber == 2){
            System.out.println("Tuesday");
        }
        if (weekDauInNumber == 3){
            System.out.println("Wednesday");
        }
        if (weekDauInNumber == 4){
            System.out.println("Thursday");
        }
        if (weekDauInNumber == 5){
            System.out.println("Friday");
        }
        if (weekDauInNumber == 6){
            System.out.println("Saturday");
        }
        if (weekDauInNumber == 7){
            System.out.println("Sunday");
        }
        if (weekDauInNumber<1||weekDauInNumber>7){
            System.out.println("Invalid number. There is not weekday for the number. Weekdays are between 1 - 7 and your number was "+weekDauInNumber);
        }
        System.out.println("------------------------------------------------------------------------------------");

        if (weekDauInNumber == 1){
            System.out.println("Monday");
        } else if (weekDauInNumber == 2) {
            System.out.println("Tuesday");
        } else if (weekDauInNumber == 3) {
            System.out.println("Wed");
        } else if (weekDauInNumber == 4) {
            System.out.println("Thur");
        } else if (weekDauInNumber == 5) {
            System.out.println("Fri");
        } else if (weekDauInNumber == 6){
            System.out.println("Sat");
        } else if (weekDauInNumber == 7) {
            System.out.println("Sun");
        }

    }
}
