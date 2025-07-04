package day26_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sumOfElems(nums));
        System.out.println(sumOfElems(new int[] {5, 6, 7, 8, 9}));

        System.out.println("------------");
        System.out.println(sumOfElems2(nums));
        System.out.println(sumOfElems2(12, 43, 564, 23, 543, 23));
    }

    // create a method which takes int array and sums up all the elements and return the result
    public static int sumOfElems(int[] nums){
        int result = 0;

        for (int eachElem : nums){
            result += eachElem;
        }

        return result;
    }

    // var args
    public static int sumOfElems2 (int ... nums){
        int result = 0;

        for (int eachElem : nums){
            result += eachElem;
        }

        return result;
    }

}
