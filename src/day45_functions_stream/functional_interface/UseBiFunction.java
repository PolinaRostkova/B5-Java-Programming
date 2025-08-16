package day45_functions_stream.functional_interface;

import my_util.FunctionsUtil;

import java.util.*;
import java.util.function.BiFunction;

/*
    BiFunction <T, U, R>:
        - it accepts TWO any type of object and returns any type of data we want
        - the abstract method in this functional interface: R apply(T t, U u)
 */
public class UseBiFunction {
    public static void main(String[] args) {
        // Lambda expression --->  () -> {}
        // Implement BiFunction which takes two numbers and return the biggest one
        BiFunction<Integer, Integer, Integer> theBiggest = (x, y) -> {
            return x > y ? x : y;
        };

        System.out.println(theBiggest.apply(10, 20));
        System.out.println(theBiggest.apply(20, 21));

        System.out.println("--------------------------------");

        System.out.println(FunctionsUtil.theBiggest.apply(20, 60));

        System.out.println("--------------------------------");

        // Implement BiFunction to take List of String and List of Integer and return Map of String and Integer

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> mergeStringAndIntIntoMap =  (list1, list2) -> {

         Map<String, Integer> map = new LinkedHashMap<>();

         if (list1.size() == list2.size()) {
             for (int i = 0; i < list1.size(); i++) {
                 map.put(list1.get(i), list2.get(i));
             }
         } else {
             throw new RuntimeException("Lists are not the same size");
         }

         return map;
        };

        List<String> list1 = new LinkedList<>(Arrays.asList("Tom", "Jerry"));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(10, 20));
        Map<String, Integer> map = new LinkedHashMap<>();
        System.out.println(mergeStringAndIntIntoMap.apply(list1, list2));
    }
}
