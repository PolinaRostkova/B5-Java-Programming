package day45_functions_stream.strem;

import my_util.FunctionsUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StrimMethods2 {
    public static void main(String[] args) {
        // Method 5: .map()
        List<Integer>nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Before .map(): " + nums);
        System.out.println("After .map():  " + nums.stream().map(each -> each * 2 ).collect(Collectors.toList()));
        List<Integer> numsMultBy2 = nums.stream().map(each -> each * 2 ).collect(Collectors.toList());
        System.out.println("After .map():  " + numsMultBy2);

        System.out.println("---------------------------------------------");
        List<String> list = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday",  "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println("Before .map(): " + list);
        List<String> afterMap = list.stream().map(each -> each.substring(0, 3).toUpperCase()).collect(Collectors.toList());
        //System.out.println("After .map():  " + list.stream().map(each -> each.substring(0, 3).toUpperCase()).collect(Collectors.toList()));
        System.out.println("After .map():  " + afterMap);

        Function<String, String> makingAbb = (each) -> {
            return each.substring(0,3).toUpperCase();
        };

        System.out.println(list.stream().map(makingAbb).collect(Collectors.toList()));

        System.out.println("---------------------------------------------");
        // Method 6: .filter();
        // .filter(); accepts Predicate: boolean test(T t); --- > accept ONE any type of data and returns boolean
        List <Integer> nums2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Before .filter(): " + nums2);

        // find all even numbers
        List <Integer> nums2WithEven = nums2.stream().filter( (e)-> e % 2 == 0  ).collect(Collectors.toList());
        System.out.println("After .filter(): " + nums2WithEven);

        List <Integer> nums2WithOdd = nums2.stream().filter( (e)-> e % 2 != 0  ).collect(Collectors.toList());
        System.out.println("After .filter(): " + nums2WithOdd);


        System.out.println("#####################################################################");
        // Method chaining map + filter + foreach
        System.out.println(nums2.stream().map(e -> e * 2).filter(e -> e % 2 == 0).collect(Collectors.toList()));
        nums2.stream().map(e -> e * 2).filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
        //nums2.stream().map(e -> e * 2).filter(e -> e % 2 == 0).collect(Collectors.toList()).forEach(e -> System.out.println(e));


        /*
            .map()          -> accepts Function: R apply(T t);
            .filter()       -> accepts Predicate: boolean test(T t);
            .foreach()      -> accepts Consumer: void accept(T t);
         */

    }
}
