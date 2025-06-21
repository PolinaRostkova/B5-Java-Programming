package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me how many friends you have: ");
        //int friendsCount = input.nextInt();

        String[] nameOfFriends = new String[ input.nextInt() ];// nut it is empty right now

        input.nextLine(); // handle enter
        for (int i = 0; i < nameOfFriends.length; i++) {
            System.out.println("Enter their names: ");
            nameOfFriends[i] = input.nextLine();
        }
        System.out.println("=======================");

        System.out.println("You have " + nameOfFriends.length + " friends. \n\tName of your friends: ");

        for (int i = 0; i < nameOfFriends.length; i++) {
            System.out.println("\t\t"+nameOfFriends[i]);

        }



    }
}
