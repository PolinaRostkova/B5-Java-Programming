package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your first name: ");
        String firstName = key.next();

        System.out.print("Please, enter your last name: ");
        String lastName = key.next();

        System.out.print("Are you employed? (true/false): ");
        boolean isEmpl = key.nextBoolean();

        System.out.print("Are you a student? (true/false): ");
        boolean isStud = key.nextBoolean();

        String fullInfo = "The person with first name "+firstName+" and last name "+lastName+" currently employed: "+isEmpl+ " and student: "+isStud;

        System.out.println(fullInfo);
    }
}
