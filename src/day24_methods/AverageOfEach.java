package day24_methods;

import day18_loops.ForLoopExample;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        int[][] nums = {
                {3,4,5,6},
                {5,2,6},
                {10,20,30}
        };
        double sumOf2DArr = 0;
        int totalCountOfAllElements = 0;
        for (int[] eachArr : nums){
            double sumOfEachArr = 0;
            for (int eachNum: eachArr){
                sumOfEachArr += eachNum;
            }

            sumOf2DArr += sumOfEachArr;
            totalCountOfAllElements += eachArr.length;
            System.out.println("Average of " + Arrays.toString(eachArr) + " is " + sumOfEachArr/eachArr.length);
            System.out.println("Average of all arrays: " + sumOf2DArr/totalCountOfAllElements);

        }
    }
}
