package day45_functions_stream.functional_interface;

import my_util.StringUtil;

import java.util.function.Predicate;
/*
    Predicate <T>:
        - it accepts one any type of object and returns boolean value
        - the abstract method in this functional interface: boolean test(T t)
 */
public class UsePredicate {
    public static void main(String[] args) {
      // Lambda expression --->  () -> {}
        Predicate<String> isPalindrome = (str) -> {
            // Option 1
            String reverseStr = StringUtil.reverse(str);
            // Option 2
            //StringBuilder reverseStrBuilder = new StringBuilder(str);
            //reverseStrBuilder.reverse();
//            // Option 3
//            String reversed = "";
//            for (int i = str.length(); i >=0 ; i--) {
//                reversed += str.charAt(i);
//            }

            //System.out.println((reverseStrBuilder));
            return str.equals(reverseStr);
        };

        System.out.println(isPalindrome.test("racecar"));
        System.out.println(isPalindrome.test("loop"));

        System.out.println("---------------------------------");

        Predicate<Integer> isPrime = (num) -> {
            int count = 0;
            for (int i = 1; i <= num ; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

//            if (count == 2){
//                return true;
//            } else  {
//                return false;
//            }

            return count == 2;
        };

        System.out.println(isPrime.test(7));
        System.out.println(isPrime.test(9));

        System.out.println("---------------------------------");

        System.out.println(UtilityFunctions.isPalindrome.test("anna"));
        System.out.println(UtilityFunctions.isPalindrome.test("camp"));

        System.out.println("---------------------------------");

        System.out.println(UtilityFunctions.isPrime.test(7));
        System.out.println(UtilityFunctions.isPrime.test(11));

    }
}
