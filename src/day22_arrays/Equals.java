package day22_arrays;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        int[] c = a;

        System.out.println(a == b); // do not use "==" when comparing arrays/any object
        System.out.println(a == c); // Same memory location since pointing to the same. BUT do NOT use "==" when comparing arrays/any object

        System.out.println("--------------------------------------------------------");

        // Comparing actual arrays object values
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a,c));

        System.out.println("--------------------------------------------------------");

        int[] d = {4, 3, 2, 1};

        System.out.println(Arrays.equals(a,d)); // when it compares, location of each elements should match as well

        Arrays.sort(a);
        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d));


    }
}
