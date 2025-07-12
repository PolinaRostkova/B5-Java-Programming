package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbers {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        nums.addAll(Arrays.asList("12", "453", "65", "23", "65", "2"));
        System.out.println("Original: " + nums); // Original: [12, 453, 65, 23, 65, 2]

        System.out.println(sumOfAllElem(nums));

    }

    public static ArrayList<Integer> sumOfAllElem(ArrayList<String> list){
        ArrayList<Integer> result = new ArrayList<>();

        for (String eachElement : list){
            String[] arr = eachElement.split("");
            int sum = 0;
            for (String eachArrElement: arr){
                int strToNum = Integer.parseInt(eachArrElement);
                sum+=strToNum;
            }

            result.add(sum); // autoboxing
        }



        return result;
    }
}
