package day34_a_static;

import my_util.ArrayUtil; // this will import only ArrayUtil file
// import my_util.*; ---> this will import everything in myUtil Package

public class NormalImport {
    public static void main(String[] args) {
        int[] nums = {32, 54, 23, 76, 8, 234};

        System.out.println(ArrayUtil.sumOfElems(nums));
    }
}
