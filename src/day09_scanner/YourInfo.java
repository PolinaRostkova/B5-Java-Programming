package day09_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your favorite book: ");
        String book = key.nextLine();

        System.out.print("Please, enter your age: ");
        byte age = key.nextByte();

        System.out.print("Pleas, enter your favorite number: ");
        long favNum = key.nextLong();

        System.out.println("\nInfo you entered: ");
        System.out.println("\tBook: "+book);
        System.out.println("\tAge: "+age);
        System.out.println("\tFavorite Number: "+favNum);
    }
}
