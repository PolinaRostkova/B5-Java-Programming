package day4_variables;
/*
Primitive Data Types:
-Whole Numbers/Integer Type: byte, short, int, long ----> if we use data directly Java takes it as int by defolt
-Decimal number/Floating Type: float, double
 */

import java.util.SortedMap;

public class PrimitiveDataType {
    public static void main(String[] args) {

        // If you know your container will hold WHOLE NUMBER: byte, short, int, long
        // If you know your container holds DECIMAL NUMBERS: float, double

        // Declaring variable -----> DataType VariableName
        byte age;
        //System.out.println(age); in this line  variable doesn't have value, nothing will be printed.
        // since code reads from the top to the bottom if value wasn't assigned before the print statement it won' print anything.
        //byte age = 10; // we cannot declare the same var name in same method.
        // int age = 10 // in this case we caNot declare the same var nae even if data type is different in same method
        age = 10; // here we assigned initial value (first time giving value), we have initialized variable
        System.out.println(age); // since age var. have value in it, my code can print it out.
        System.out.println("age");// here we are printing the DATA itself directly - letters (string)
        System.out.println(10);// here we are printing the DAT itself directly - whole number (any number we wil give to java it will take it as int
        System.out.println("10");// when we have something in double quotes "" the system takes it as a letter - data type is letter

        age = 20;

        // Declaring var + assigned initial value ----> DataType VarName = value/data
        short year = 2025;
        System.out.println(year); //short data type
        System.out.println(2025);// data type int (takes it as int by defolt) not connected with value we assigned before, just a number by itself

        //declaring variable
        int adressNumber;
        // assigning valur/data into variable called adressNumber
        adressNumber = 100;
        System.out.println(adressNumber); // int - data type
        System.out.println(100); // still int but has nothing to do with var valur we assigned
        System.out.println("100"); // letter - String

        // declairing var
        long creditCardNumber;
        // initializing the value
        creditCardNumber = 1234567890123456789L; // if we declaire long data type we have to put L in the end



    }
}
