package day22_arrays;

import java.util.Arrays;

public class SortStringEx {
    public static void main(String[] args) {
        String [] str = {"java", "hello", "by", "Hi", "Apple", "Abc", "4", "3", "*", "?"};

        // Order of String sorting: Special Characters ---> Numbers ---> UPPER CASE ---> lowercase --> then alphabetic order
        // string sorting follows the ASCII table order
        System.out.println("Before sorted: " + Arrays.toString(str));

        Arrays.sort(str);

        System.out.println("After sorted: " + Arrays.toString(str));
    }
}
