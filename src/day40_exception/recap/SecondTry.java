package day40_exception.recap;

public class SecondTry {
    public static void main(String[] args) {


        try {
            String str = null;
            str.length(); // NullPointerException

            int[] nums = {1,2,3,4};
            System.out.println(nums[1]); // ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {
            System.out.println("Either NullPointerException or ArrayIndexOutOfBoundsException happened");

        }

        System.out.println("Finish line");
    }
}
