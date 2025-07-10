package day28_arrayList;

import java.lang.foreign.PaddingLayout;
import java.util.ArrayList;

public class Recap {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println(nums);

        nums.add(100);
        System.out.println(nums);
        nums.add(200);
        System.out.println(nums);
        nums.add(300);
        System.out.println(nums);
        nums.add(400);
        System.out.println(nums);

        System.out.println(nums);


        System.out.println("-------------------------");

        System.out.println(nums.size());
        System.out.println(nums.get(0)); // index
        System.out.println(nums.get(nums.size()-1));

        System.out.println("-------------------------");

        nums.add(500);
        nums.add(500); // insertion order is kept
        nums.add(300); // duplicate data is kept

        System.out.println(nums);

        System.out.println("-------------------------");

        nums.add(1, 900);
        System.out.println(nums);

        //nums.add(10, 100); | IndexOutOgBondException

        nums.add(nums.size() - 1, 800);
        System.out.println(nums);

        System.out.println("-------------------------");
        int n = 0;
        nums.remove(0); // removing by index
        System.out.println(nums);

        nums.remove(n);
        System.out.println(nums);

        Integer n2 = 0;
        nums.remove(n2); // remove by element is no match is found nothing is removed

        // nums.remove(200); // removing by index and since we don't have index 200 in this list we are getting IndexOutOfBoundsException
        System.out.println(nums);

        nums.remove((Integer)200); // removes the first match !!! elements not index
        System.out.println(nums);
    }
}
