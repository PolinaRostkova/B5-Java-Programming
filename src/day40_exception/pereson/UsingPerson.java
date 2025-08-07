package day40_exception.pereson;

import java.util.Scanner;

// runner class
public class UsingPerson {
    public static void main(String[] args) {
        Person person = new Person();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        // option 1: handling possible runtime exception
        try {
            person.setName(name);
        }catch (RuntimeException e){
            System.out.println( e.getMessage());
        }


        System.out.println("Last line of a code");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            person.setAge(age);
        } catch (Exception e) {
            //System.out.println(e.getMessage());;
            e.printStackTrace();
        }

        System.out.println("Last line of a code");
    }
}
