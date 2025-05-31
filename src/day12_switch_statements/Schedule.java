package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("What day of the week is today? ");
        String day = key.next();

        switch (day){
            case "Monday":
                System.out.println("We have mentor sessions on Monday");
                break;
            case "Tuesday":
                System.out.println("We have no classes");
                break;
            case "Wednesday":
                System.out.println("We have Java class");
            default:
                System.out.println("Not valid date");
        }
    }
}
