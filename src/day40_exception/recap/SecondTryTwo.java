package day40_exception.recap;

public class SecondTryTwo {
    public static void main(String[] args) {


        try {
            String str = null;
            str.length(); // NullPointerException

            int[] nums = {1,2,3,4};
            System.out.println(nums[1]); // ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        System.out.println("Finish line");
    }
}
