package day23_multi_dem_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] arr = {45,123,62};
        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.print("How many elements do you want to add: ");
        int newSize = arr.length + key.nextInt();
        int[] arrBigger = Arrays.copyOf(arr, newSize);
        System.out.println("The new array is: " + Arrays.toString(arrBigger));

        System.out.println("Give me elements so i can add then into array");

        for (int i = arr.length; i < arrBigger.length; i++) {
            System.out.print("Your number: ");
            int userNum = key.nextInt();
            arrBigger[i] = userNum;
        }

        System.out.println("Your bigger array: " + Arrays.toString(arrBigger));



    }
}
