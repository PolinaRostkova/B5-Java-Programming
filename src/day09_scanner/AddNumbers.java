package day09_scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        // Created Scanner object and assigned it into keyboard object reference
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers: ");
        System.out.print("Number 1:" );
        int num1 = keyboard.nextInt(); // to use this number that usr gave to us we need to assign in ti a viriable and then we can use it
        System.out.print("Number 2: ");
        int num2 = keyboard.nextInt();
        System.out.print("Number 3: ");
        int num3 = keyboard.nextInt();

        int sum = num1+num2+num3;
        System.out.printf("\nSum of numbers: %d", sum);

        double division = sum/2;
        System.out.printf("\nHalf of the total: %.4f", division);

        System.out.println("\nAfter adding 2: "+(division+2));





    }
}
