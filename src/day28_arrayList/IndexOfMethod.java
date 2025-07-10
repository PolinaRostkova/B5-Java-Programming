package day28_arrayList;

import java.util.ArrayList;

/*
   ArrayList methods:
           .size();
           .add(element);
           .add(index, element/data);
           .get(index);
           .isEmpty()
           .contains(element)
           .remove(byObject)
           .remove(byIndex)
           .clear();
           .set(index, element);
           .indexOf(element);
           .lastIndexOf(element);


           ArrayList on the background Array
           - size is NOT fixed
           - works with object type data
           - internally uses Array
           - keeps insertion order
           - allows duplicate elements
*/
public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "loopcamp";
        //            01234567
        System.out.println(str.indexOf("o")); // find the first match index from the beginning to the end
        System.out.println(str.indexOf("K")); // no match gives --->  -1
        System.out.println(str.lastIndexOf("p")); // check all the indexes from the end to the beginning the first match --> 7


        System.out.println("----------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(200);
        nums.add(600);
        System.out.println(nums);

        //[100, 200, 300, 400, 500, 200, 600]
        //  0    1    2     3   4    5    6

        // indexOf(element)
        System.out.println(nums.indexOf(200)); // find the first match index from the beginning to the end --> 1
        System.out.println(nums.indexOf(700)); // no match --> -1
        System.out.println(nums.lastIndexOf(200)); // for the end 200 has index of 5

    }
}
