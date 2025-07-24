package day34_a_static;

import static my_util.ArrayUtil.*; // this will import all statics in ArrayUtil in my_util package

public class StaticImport {
    public static void main(String[] args) {
        int[] nums = {32, 54, 23, 76, 8, 234};

        System.out.println(sumOfElems(nums)); // since we did static import we can use method directly without the class name
    }
}
