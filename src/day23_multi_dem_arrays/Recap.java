package day23_multi_dem_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int[] arr1 = {30, 90, 60, 360, 180};
        int[] arr2 = {90, 360, 30, 60, 180};

        //How to print arr / how to convert to String including [] and comma
        String str = Arrays.toString(arr1); // [30, 90, 60, 360, 180]
        System.out.println(str);
        //or
        System.out.println(Arrays.toString(arr1));

        //How to compare two arrays

        System.out.println("Before sorting: ");
        boolean isSame = Arrays.equals(arr1, arr2); // equals method takes 2 arguments
        System.out.println(isSame);
        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println();

        // How can i Sort Array

        System.out.println("After sorting: ");
        Arrays.sort(arr1); // sort method takes one argument
        Arrays.sort(arr2);

        isSame = Arrays.equals(arr1, arr2);
        System.out.println(isSame);

        System.out.println();

        // How to join elements in array / how to convert array into String
        String[] strArr = {"java", "selenium", "jira", "sprint", "release"};
        System.out.println(Arrays.toString(strArr));

        String str2 = String.join("", strArr); // takes two arguments
        System.out.println(str2);
        String str3 = String.join("*", strArr); // with join method we can convert Array to String as a whole
        System.out.println(str3);
        System.out.println( String.join(", ", strArr) ); // java, selenium, jira, sprint, release

        System.out.println();

        //How convert String into char
        String str4 = "loopcamp";
        char[] strCharArr = str4.toCharArray();
        System.out.println(Arrays.toString(strCharArr)); // [l, o, o, p, c, a, m, p]
    }

}
