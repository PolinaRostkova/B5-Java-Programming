package day10_if_statements;

import java.util.Scanner;

public class EvenOrOddWithIf {
    public static void main(String[] args) {
        //created a scanner object
        Scanner  key = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = key.nextInt();

        boolean isEven = number % 2 ==0;
        //boolean isOdd = !isEven;

        if (isEven) {
            System.out.println(number + " is even!");
        }
        if (!isEven){
            System.out.println(number+" is odd!");
        }
    }
}
