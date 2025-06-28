package day24_methods;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = key.nextLine(); // Tom Jerry ---> tjerry@gmail.com
        buildEmail2(fullName);


    }

    public static void buildEmail(String fullName){
        String result = ("" + fullName.charAt(0) + fullName.substring(fullName.indexOf(" ") + 1) + "@gmail.com");
        result = result.toLowerCase();
        System.out.println(result);
    }

    public static void buildEmail2(String fullName){
        String[] fullNameArr = fullName.split(" ");
       String result =  ("" + fullNameArr[0].charAt(0) + fullNameArr[1]);

       //        String result = ("" + fullName.charAt(0) + fullName.substring(fullName.indexOf(" ") + 1) + "@gmail.com");
        //        result = result.toLowerCase();
        System.out.println(result.toLowerCase());
    }
}
// todo: implement the code which handles 3 names instead of 2