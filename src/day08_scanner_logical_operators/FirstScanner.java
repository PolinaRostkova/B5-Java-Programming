package day08_scanner_logical_operators;

import java.util.Scanner;
// import.java.lang - imported automatically

public class FirstScanner {
    public static void main(String[] args) {
        // Scanner input --->   'input' is the object reference name (non-primitive data type)
        // new Scanner(System.in); ---> object
        // int a;        --->   'a' is the variable name (primitive)

        // Declared and instantiated Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        //String name = "Tom Jerry";
        String name = input.nextLine();
        System.out.println();

        System.out.println("My name is: "+name);
    }
}
