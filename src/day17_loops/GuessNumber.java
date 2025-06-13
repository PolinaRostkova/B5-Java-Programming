package day17_loops;

import java.util.Scanner;

/*
    create a program to guess the secret number.
    flow will be as follows:
    define the secret number, hard coded
    ask the user to guess a number
    based on the guess tell them a message:

        if they guess higher than the number:
          too high

        if they guess lower than the number:
          too low

        if they guess the number:
          you guessed correctly

          -> this will stop the guessing flow
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int secretNum = 435;
        int userGuess;
        int userAttempt = 4;

        do {
            System.out.print("Guess what my secret number is: ");
            userGuess = key.nextInt();

            if (userGuess < secretNum){
                System.out.println("Too low. Go higher");
            } else if (userGuess > secretNum) {
                System.out.println("Too high. Go lower");
            } else {
                System.out.println("You guessed correctly");
            }

            userGuess--;
        } while (userGuess != secretNum && userAttempt < 0);

// todo: in this code implement it to only allow user to guess 4 times
        //hint: check ATM task

    }
}
