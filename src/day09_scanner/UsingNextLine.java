package day09_scanner;

import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("What day is today: ");
        String day = key.nextLine();

        System.out.print("Enter your first name: ");
        String name = key.next();

        System.out.print("Enter your last name: ");
        String lastName = key.next();

        key.nextLine(); // it will handle the enter button

        System.out.print("Please, enter your address: ");
        String address = key.nextLine(); //since nextLine is taking multiple things as an input including space, character and EVEN pressing ENTER as an input

        //RULE: with nextLine()---> if there is any other scanner methods, except nextLine, before nextLine() method we have to handle ENTER
        // TO hand it: we use an extra newLine()

        System.out.print("Please, enter your job title: ");
        String job = key.nextLine();

        System.out.println("Please enter your team members names: ");
        String team = key.nextLine();

        System.out.print("How many team members you have in your team: ");
        int numMembers = key.nextInt();

        key.nextLine();

        System.out.print("What are the holidays you have: ");
        String holidays = key.nextLine();

    }

}
