package day17_loops;

import java.util.SortedMap;

public class PrintNum {
    public static void main(String[] args) {
        System.out.println("Start the code execution......");

        //1# WHILE loop
        // Infinite loop --> will execute this code block until condition is true, so it will be infinite
//        while (true){
//            System.out.println("Hi!");
//        }


        int num = 1;

        while (num <= 10){
            System.out.println(num);
            num++;
        }
        System.out.println("After if statement. ");

        System.out.println("-----------------------");

        int i = 1;

        // Q: Can you find all the even numbers from 1 to 10?
        while (i <= 10){
            if ( i % 2 == 0){
                System.out.println(i);
            }

            i++;
        }

        System.out.println("-----------------------");

        //Q: Can you find all the numbers divisible by 5 between 1 and 100?

        int start = 5;

        while (start <= 100){
            if (start % 5 == 0){
                System.out.println(start);
            }
            start++;
        }

    }
}
