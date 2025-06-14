package day18_loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter a number and i will tell you if it is a PRIME or NOT: ");
        int userNum = key.nextInt();
        int howManyTimesDivisible = 0;

        if (userNum == 0) {
            System.out.println("Not divisible");
        } else {
            for (int i = 1; i <= userNum; i++) { // start taking 1,2,3,4,5...... until userNum ends

                if (userNum % i == 0) {
                    howManyTimesDivisible++;
                }
            }
            if (howManyTimesDivisible == 2){
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

    }
}
