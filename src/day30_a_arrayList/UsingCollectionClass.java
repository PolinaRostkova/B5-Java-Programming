package day30_a_arrayList;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionClass {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(); // size = 0 | capacity = 10
        list1.addAll(Arrays.asList(10, 2, 4, 62, 23, 9)); // size = 6
        System.out.println(list1); // [10, 2, 4, 62, 23, 9]

        // Collections class
        // .sort(); - [2, 4, 9, 10, 23, 62]
        Collections.sort(list1);
        System.out.println(list1); // [2, 4, 9, 10, 23, 62]

        // .reverse(); - [62, 23, 10, 9, 4, 2]
        Collections.reverse(list1);
        System.out.println(list1); // [62, 23, 10, 9, 4, 2]

        // .max(); | .min(); - [2, 4, 9, 10, 23, 62]
        System.out.println(Collections.min(list1)); // 2
        System.out.println(Collections.max(list1)); // 62

        // .swap(); - [2, 23, 10, 9, 4, 62]
        Collections.swap(list1, 0, list1.size()-1);
        System.out.println(list1);

        // .frequency();
        String str = "java is cool programming language"; // array           - ["j", "a", "v" ..... "e"]
        //Arrays.asList( str.split("") );             // ArrayList       - ["j", "a", "v" ..... "e"]

        int count = Collections.frequency(Arrays.asList(str.split(""))," ");
        System.out.println("In your sentence there " + (count + 1) + " words" );

        // You can do it directly like below
        String [] arr1 = str.split(" ");
        System.out.println("In your sentence, there are " + arr1.length + " words.");

        //Or even you can do it directly like below
        ArrayList <String> list3 = new ArrayList<>( Arrays.asList( str.split(" ") ) );
        System.out.println("In your sentence, there are " + list3.size() + " words.");



    }
}
