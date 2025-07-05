package day27_wrapper_arrayList;

import java.util.Scanner;
import java.util.SortedMap;

public class ParseNumbers {
    public static void main(String[] args) {
        /*
             "Hi"
             "1"
             "23.6"
             "K"
             "true"
         */

        Scanner key = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String age = key.nextLine(); // "12" takes it as a String

        System.out.println("You were born in " + (2025 - Integer.parseInt(age)) ); // 2025 - "12" ---> we can not do this, but we can do this in example 2025 - 12 (int)
        System.out.println("You were born in " + (2025 - Integer.valueOf(age)) ); // 2025 - 12 --> 12 is (Integer)

        System.out.println("------------------------");

        System.out.print("Please enter true or false: ");
        String trueOrFalse = key.nextLine(); // "true" -> string dataType

        if (Boolean.parseBoolean(trueOrFalse)){
            System.out.println("You entered: " + true);
        } else {
            System.out.println("You entered: " + false);
        }
    }
}
