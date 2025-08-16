package day45_functions_stream.functional_interface;

import my_util.FunctionsUtil;

import java.util.function.BiPredicate;
/*
    BiPredicate <T, U>:
        - it accepts one any type of object and returns any data type
        - the abstract method in this functional interface: boolean test(T t, U u)
 */
public class UseBiPredicate {
    public static void main(String[] args) {
        // implement function which checks if given number is in the array
        BiPredicate<Integer, Integer[]> contains = (num, numArr) -> {
            boolean result = false;
            for (int i : numArr) {
                if (i == num) {
                    result =  true;
                    break;
                }
            }
            return result;
        };

        Integer[] nums = {1, 2,3, 4, 5};
        Integer num = 5;
        System.out.println(contains.test(num, nums));
        System.out.println("--------------------------------");

        System.out.println(FunctionsUtil.contains.test(num, nums));
    }
}
