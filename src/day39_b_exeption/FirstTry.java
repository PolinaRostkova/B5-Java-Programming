package day39_b_exeption;

import day33_a_static.Song;

import java.util.Scanner;

public class FirstTry {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("First Println Statement");

        System.out.print("Give me the index: ");
        int index = key.nextInt();
       // String str = 'loop'; // checked exception | compile time exception
        String str = "loop";

        // try catch block is the only way to handle exception
        try{
            System.out.println( str.charAt(index)); //StringIndexOutOfBoundsException | unchecked exception
        } catch (Exception e){
            //System.out.println("Exception occurred, and we caught it");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
         // if the index user gave is coursing an issue the code will crash in this line
        // After the crash the code ends execution | StringIndexOutOfBoundsException | unchecked exception
        System.out.println("Last Println Statement");
    }
}
