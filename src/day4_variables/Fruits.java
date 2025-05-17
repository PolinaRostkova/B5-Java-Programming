package day4_variables;

import java.util.SortedMap;

public class Fruits {
    public static void main(String[] args) {
        int appleCount = 80;
        int grapeCount = 100;
        int orangeCount = 150;

       // System.out.println("This is how many apples we have:"+appleCount);
//        System.out.println("This is how many apples we have:80"); // Hard coding here- static value
//        System.out.println("I have sold 50 apples");
//        System.out.println("This is how many apples left 30");
       // appleCount = 30;//reassigned new value

        System.out.println("This is how many apples we have:"+appleCount);
        System.out.println("I have sold 50 apples");
        appleCount = 80-50;
        System.out.println("This is how many we have left:"+appleCount);
        System.out.println();

        System.out.println("Grape Count: "+grapeCount);
        System.out.println("Orange Count: "+orangeCount);
        System.out.println();

        int applePrice = 15;
        // this is price of my 30 apples is $15
        System.out.println("This price of my"+appleCount + " apples is $"+applePrice);// this is dynamically used data
        System.out.println();
        //CONCATENATION ---> after first double quotation, everything is put next to each other
        // After concatenation (including concatenation)----> everything becomes String data type





    }

}
