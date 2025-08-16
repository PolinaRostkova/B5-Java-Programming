package day45_functions_stream.functional_interface;

import my_util.FunctionsUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
    BiConsumer <T, U>:
        - it accepts one any type of object and returns void
        - the abstract method in this functional interface: void accept(T t, U u)
 */
public class UseBiConsumer {
    public static void main(String[] args) {
        // Implement BiConsumer function which takes a word and a number and prints word with the count of given number

        BiConsumer<String, Integer> printWordNumOfTimes = (str, num) -> {
            for (int i = 1; i <= num ; i++) {
                System.out.print(str + " ");
            }
            System.out.println();
        };

        printWordNumOfTimes.accept("Hello", 5);

        System.out.println("--------------------------------");

        FunctionsUtil.printWordNumOfTimes.accept("Loopcamp", 6);

        System.out.println("\n----------------------------");

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Tom", 10);
        map.put("Jerry", 20);
        map.put("Bob", 30);

        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
