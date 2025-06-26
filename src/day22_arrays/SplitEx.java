package day22_arrays;

import java.util.Arrays;

public class SplitEx {
    public static void main(String[] args) {
        String str = "monday tuesday thursday friday saturday sunday";
        System.out.println("String size: " + str.length());

        String[] days = str.split(" ");
        System.out.println(Arrays.toString(days));
        System.out.println("Array size: " + days.length);

        System.out.println("-----------------------------");

        String[] days2 = str.split("day"); // so it will find the matching one and splint it so remove it [mon,  tues,  thurs,  fri,  satur,  sun]
        System.out.println(Arrays.toString(days2));

        for (int i = 0; i < days2.length; i++) {

           days2[i] =  days2[i].trim();
        }
        System.out.println(Arrays.toString(days2));

        System.out.println("-----------------------------");

        String[] days3 = str.split("day "); // so it will find the matching one and splint it so remove it [mon,  tues,  thurs,  fri,  satur,  sun]
        System.out.println(Arrays.toString(days3));

        System.out.println("-----------------------------");

        String[] days4 = str.split("");
        System.out.println(Arrays.toString(days4)); // [m, o, n, d, a, y,  , t, u, e, s, d, a, y,  , t, h, u, r, s, d, a, y,  , f, r, i, d, a, y,  , s, a, t, u, r, d, a, y,  , s, u, n, d, a, y] --- > but it still String
        char[] days5 = str.toCharArray();
        System.out.println(Arrays.toString(days5)); // this gives the same output but it is already a CHAR!!!

        System.out.println("-----------------------------");
        String[] day6 = str.split("-");

    }
}
