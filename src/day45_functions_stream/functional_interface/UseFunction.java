package day45_functions_stream.functional_interface;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
    Function <T, R>:
        - it accepts one any type of object and returns also any data type of object
        - the abstract method in this functional interface: R apply(T t)
 */
public class UseFunction {
    public static void main(String[] args) {
        // Lambda expression --->  () -> {}
        Function<Integer[], List<Integer>> convertArrayToList = (arr) -> {

            List<Integer> list = new ArrayList<>();

            for (int num : arr){
                list.add(num);
            }

            return list;
        };

        Integer[] nums = {1, 2,3, 4, 5};
        System.out.println(convertArrayToList.apply(nums));

        System.out.println("--------------------------------");

        System.out.println(UtilityFunctions.convertArrayToList.apply(nums));
    }
}
