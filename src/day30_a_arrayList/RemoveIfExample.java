package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3));

        System.out.println("Before loop: " + nums);
//        for (Integer eachElements : nums){
//            if (eachElements == 54){
//                nums.remove(eachElements);
//            }
//        }

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0){
                nums.remove(nums.get(i));
            }
        }
        System.out.println("After loop:  " + nums);

        //Q: why some are removed but some are not even if condition is true
        //A: it is all because arrayList is not fixed, since i removed some elements all other shifted and possible some of the elements not gonna be checked
        //[3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3]

        System.out.println("-----------------------------------------------------------------------");
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3));
        System.out.println("Before: " + nums2);

        // LAMBDA: referenceName -> condition
        nums2.removeIf(each -> (each % 2 == 0));
        /*
        from nums2 ArrayList
            - take each element and assign it into "each" reference name
            - check the condition
                - if true - remove
         */

        System.out.println("After:  " + nums2);

        System.out.println("-----------------------------------------------------------------------");

        // .replaceAll();

        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3));
        System.out.println("Before: " + nums3);
        nums3.replaceAll(eachElement -> eachElement + 2);
        System.out.println("After:  " + nums3);
        nums3.replaceAll(eac -> eac * 2);
        System.out.println("After:  " + nums3);

        System.out.println("-----------------------------------------------------------------------");

        ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3));
        System.out.println("Before: " + nums4);
        // doing same thing with fori loop
        for (int i = 0; i < nums4.size(); i++) {
            nums4.set(i, nums4.get(i) * 2);
        }
        System.out.println("After:  " + nums4);

    }
}
