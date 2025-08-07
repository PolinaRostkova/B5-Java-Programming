package day40_exception.recap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        try {
            System.out.print("Please enter the first number: ");
            int firstNumber = key.nextInt(); //InputMismatchException
            System.out.print("Please enter the second number: ");
            int secondNumber = key.nextInt(); // InputMismatchException, if user gives number 2 as a String "Two"

            System.out.println(firstNumber / secondNumber);  //ArithmeticException if 1/0 | we can't divide by 0
            // any parent exception class cannot be before the child class exception but other way around is OKAY
//        } catch (Exception e) {
//            e.getMessage();
        }catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {

            // finally is a block will be executed no metter if there was an exception or not (if the exception caught or not)
            System.out.println( "Finally block");
            key.close();
        }

        System.out.println("The End");
    }
}
