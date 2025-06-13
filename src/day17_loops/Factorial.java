package day17_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //n! = n * (n - 1); .......
        // 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 is a factorial of 6
        Scanner keu = new Scanner(System.in);
        System.out.print("Give me a number and i will tell you a factorial: ");
        int num = keu.nextInt();
        int result = 1;

        while (num >= 6){
            result = result * num; // result = 1 * 4  | result = 4 * 3 | result = 12 * 2  | result = 24 * 1
            num--; //                   num = 3       |  num = 2       |      num = 1     |   num = 0
        }

        System.out.println(result);

    }
}
