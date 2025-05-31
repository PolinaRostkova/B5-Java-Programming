package day10_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int tem = input.nextInt();

        // above of equal to 70 and less than 80
        if (tem >= 70 && tem < 80){
            System.out.println("It is a nice day");
            System.out.println("Go outside, but with your laptop to code Java");
        } else {
            System.out.println("Its to cold");
            System.out.println("Code more Java");
        }
    }
}
