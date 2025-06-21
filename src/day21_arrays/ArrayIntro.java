package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        String str1 = "Virginia";

        char letter1 = str1.charAt(0);
        char letter2 = str1.charAt(1);
        char letter3 = str1.charAt(2);
        char letter4 = str1.charAt(3);
        char letter5 = str1.charAt(4);
        char letter6 = str1.charAt(5);
        char letter7 = str1.charAt(6);
        char letter8 = str1.charAt(7);

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);
        System.out.println(letter6);
        System.out.println(letter7);
        System.out.println(letter8);

        System.out.println();

        String str2 = "Chicago Fairfax NewYork Boston";
        String city1 = "Chicago";
        String city2 = "Fairfax";
        String city3 = "NewYork";
        String city4 = "Boston";

        //q: get me the 1 city
        //a: use substring method with indexOf method to her the first one

        //Declare String Array

        String [] cities; // just a declaration
        int a;

        //Declare String array and assign a value directly
        // Option 1 for assigning a value
        String [] cities1 = {"Chicago", "Fairfax", "NewYork", "Boston"}; // we have made String Array with initial 4 values added directly
        String [] cities2 = {city1,city2,city3,city4}; // we have made String Array with initial 4 values using previously made String variables

        //Option 2 for assign a value
        String [] cities3 = new String[4]; // we have made string array with 4 element locations with no values in them

        // q: how can i read the elements from array (how do we read each char from String)
        // a: similar to String we will be using indexes to get the element at the given index

        System.out.println(city1.charAt(0)); // "Chicago" --> will give me "c"
        System.out.println(cities1[0]);      // {"Chicago", "Fairfax", "NewYork", "Boston"} ---> "Chicago"
        //                                          0           1           2          3
        System.out.println(cities1[1]);
        System.out.println(cities1[2]);
        System.out.println(cities1[3]);

        //q: how can i print all the elements in Array?

        System.out.println(cities1); // [Ljava.lang.String;@27716f4 ---> we cannot print array directly it will give as some memory location

        System.out.println(Arrays.toString(cities2));

        String arrayInString = Arrays.toString(cities1); // i have it here as a one whole String because we assigned it to a String "[Chicago, Fairfax, NewYork, Boston]"
        System.out.println(arrayInString);

        //q: how can i get rid off [ - ] - ,
        System.out.println();

        System.out.println(arrayInString.substring(1, arrayInString.length()-1 ).replace(",","")); // method chaining

        System.out.println();

        System.out.println(Arrays.toString(cities1));
        System.out.println(Arrays.toString(cities2));
        System.out.println(Arrays.toString(cities3));

        System.out.println();
        //q: how can i see how many elements are in array
        System.out.println(city1.length()); // "Chicago" - > 7 characters
        System.out.println(cities1.length); // {"Chicago", "Fairfax", "NewYork", "Boston"} --> 4
        System.out.println(cities3.length); // [null, null, null, null] --> means empty and nothing stored there, but still length 4 because we declared 4 objects

    }
}

/*
 Declaration & assigning array
        String [] cities1 = {"Chicago", "Fairfax", "NewYork", "Boston"};
        String [] cities3 = new String [4];
    Printing Array
        Arrays.toString (arrName);
    Size of array
        arrName.length;
    Getting element from array
        arrayName[index]
 */
