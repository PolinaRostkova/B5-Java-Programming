package day22_arrays;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        System.out.print("How many numbers do you want to compare: ");
        int[] nums = new int[key.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter a number: ");
            nums [i] = key.nextInt();
        }

        for (int eachELe : nums){

            if (eachELe > maxNum){
                maxNum = eachELe;
            }

            if (eachELe < minNum){
                minNum = eachELe;
            }
        }

        System.out.println("Max: " + maxNum);
        System.out.println("Min: " + minNum);
    }
}
