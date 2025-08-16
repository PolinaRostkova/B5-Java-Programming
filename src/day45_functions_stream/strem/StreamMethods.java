package day45_functions_stream.strem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        /* Stream is not a data structure
             - It is a method that get the input from all the other data structures
                - which will help us to use some of the built-in reusable methods
             - Can work with Array and all the other collection data structure

             1. Arrays
         */

        //1 -  .stream() --> with Array
        int[] numbers = {1, 2, 3, 4, 5};

        // Steps to use array with stream
        /*
                1. Convert array into stream
                    - NOT VALID for array: numbers.stream()
                    - VALID: Arrays.stream(numbers)
         */

        Arrays.stream(numbers);




         // 2 - .stream() ---> with Collection
         /*
                1. Convert list into stream
                    - VALID: list.stream();
                2. We will apply the method we want from strem
                3. Then convert stream back to collection

                * Does NOT change the original collection
         */
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.stream();

        System.out.println("--------------------------------------------------------");

        // Method 1: distinct(); --> removes duplicates
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 54, 2, 54, 1, 654, 23, 1, 2));
        System.out.println("l1 Before distinct= " + l1);
        //System.out.println("l1 after distinct=  " + l1.stream().distinct()); // java.util.stream.DistinctOps$1@4a574795 ---> memory location
        System.out.println("l1 after distinct=  " + l1.stream().distinct().collect(Collectors.toList())); // java.util.stream.DistinctOps$1@4a574795 ---> memory location
        /*
                1. l1.stream() --> converted to the stream
                2. .distinct() --> used the method
                3. collect(Collectors.toList() --> converted back to the List
         */

        System.out.println(l1); // [1, 2, 3, 4, 5, 54, 2, 54, 1, 654, 23, 1, 2] --> does NOT change the original collection

        System.out.println("--------------------------------------------------------");

        int[] n1 = new int[]{1, 2, 3, 4, 5, 54, 2, 54, 1, 654, 23, 1, 2};
        System.out.println("n1 Before distinct= " + Arrays.toString(n1));
        System.out.println("n1 after distinct=  " + Arrays.toString(Arrays.stream(n1).distinct().toArray()));

        /*
                1. Arrays.stream(n1)
                2. .distinct()
                3. .toArray

                * Does NOT change the original collection
         */

        System.out.println("--------------------------------------------------------");
        // Method 2: limit(); --> keeps the number of elements from beginning to the given number
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("l2 Before limit= " + l2);
        System.out.println("l2 After Limit=  " + l2.stream().limit(5).collect(Collectors.toList()));

        System.out.println("--------------------------------------------------------");
        // Method 3: skip() --> removes the number of elements from beginning to the given number
        System.out.println("l2 Before skip= " + l2);
        System.out.println("l2 After skip= " + l2.stream().skip(3).collect(Collectors.toList()));

        System.out.println("--------------------------------------------------------");
        // Method chaining with stream methods
        System.out.println("l2 Before stream chaining= " + l2);
        System.out.println("l2 After stream chaining=  " + l2.stream().skip(3).limit(2).collect(Collectors.toList()));

        System.out.println("--------------------------------------------------------");
        // Method 4: .count(); --> shoes how many unique w=objects we have
        // Method 4: .count();
        List <Integer> l3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5));
        System.out.println("List before count: " + l3);
        System.out.println("List before count - size: " + l3.size());
        System.out.println("List after count: " + l3.stream().count());

        // get me how many element I have after removing duplicates
        System.out.println("List after count on uniques: " + l3.stream().distinct().count());
        System.out.println("List after size on uniques: " + l3.stream().distinct().collect(Collectors.toList()).size());


        System.out.println("...................................................");
        String str = "aaabbbddddssseeettssffss";

        //1 - str.split("");
        //2 - Arrays.stream(str.split("")).distinct();
        //3 - Arrays.stream(str.split("")).distinct().toArray();
        System.out.println(   Arrays.toString(Arrays.stream(str.split("")).distinct().toArray())  );
        // Convert array to stream --> apply stream method ---> convert back to array -- > print array
        System.out.println(   Arrays.stream(str.split("")).distinct().toArray().length  );
        System.out.println(    Arrays.stream(str.split("")).distinct().collect(Collectors.toList())   );
        // Convert array to stream --> apply stream method ---> convert back to list -- > print list


    }
}
