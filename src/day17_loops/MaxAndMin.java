package day17_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Tell me how many number do you want to compare: ");
        int userDesiredCycle = key.nextInt();
        int smallest = 2_147_483_647;
        int biggest = -2_147_483_648;

        while (userDesiredCycle >= 1) {
            System.out.println("Enter number: ");
            int userNumEachCycle = key.nextInt();

            if (userNumEachCycle < smallest){
                smallest = userNumEachCycle;
            }

            if (userNumEachCycle > biggest){
                biggest = userNumEachCycle;
            }


            userDesiredCycle--;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Biggest: " + biggest);
    }
}
