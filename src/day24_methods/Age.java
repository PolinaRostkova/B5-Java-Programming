package day24_methods;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your data of birth year: ");
        int birthYear = key.nextInt();
        calculateAge(birthYear);
    }

    public static void calculateAge(int birthYear){

        if (birthYear <=0 ){
            System.out.println("You entered invalid input");
        } else {
            //System.out.println("Your age: " + (2025 - birthYear));
            System.out.println("Your age: " + (Year.now().getValue() - birthYear)); // dynamic way to always get the current year
        }

    }
}
