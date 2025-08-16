package day45_functions_stream.functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/*
    Consumer <T>:
        - it accepts one any type of object and returns void
        - the abstract method in this functional interface: void accept(T t)
 */
public class UseConsumer {
    public static void main(String[] args) {
        // Lambda expression --->  () -> {}

        Consumer<Integer> printNumbers = (num) -> {
            for (int i = 1; i <= num ; i++) {
                System.out.print(i + " ");
            }
        };

        printNumbers.accept(5);

        System.out.println("\n----------------------------");
        UtilityFunctions.printNumbers.accept(5);

        System.out.println("\n----------------------------");

        List<String> list = new LinkedList<>(Arrays.asList("Java", "Selenium", "API"));
        list.forEach(each -> System.out.print(each + " "));
    }
}
