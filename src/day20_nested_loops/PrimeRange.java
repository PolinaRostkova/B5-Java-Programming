package day20_nested_loops;

import java.util.Scanner;
// q: find all the prime numbers until XX number
public class PrimeRange {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter a number and i will tell you all the prime numbers until that number: ");

        // 5 ---> 1, 2, 3, 4, 5 is prime
        // 1 is prime? --> 1, 1
        // 2 --> 1, 2
        // 3 --> 1, 2, 3
        // 4 --> 1, 2, 3, 4
        // 5 --> 1, 2, 3, 4, 5


        int userNum = key.nextInt();


        // outer loop - taking each number from 1 in the range up to whatever user gave us.
        for (int eachNum = 1; eachNum <= userNum ; eachNum++) { // if user gave me 7 --> i will take 1, 2, 3, 4, 5, 6, 7 and check


            int howManyTimesDivisible = 0;

            if (userNum == 0) {
                System.out.println("Not divisible");

            } else {
                // inner loop -  - I am check on eachNumber to see how many times it is fully divisible from 1 to itself
                for (int i = 1; i <= eachNum; i++) { // start taking 1,2,3,4,5...... until userNum ends

                    if (eachNum % i == 0) {
                        howManyTimesDivisible++;
                    }
                }


                if (howManyTimesDivisible == 2){
                    System.out.println( eachNum + " Prime");
                }

            }

        }
    }
}
