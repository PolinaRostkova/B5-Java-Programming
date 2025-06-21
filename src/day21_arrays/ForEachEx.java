package day21_arrays;

public class ForEachEx {
    public static void main(String[] args) {
        int[] nums = {4, 24, 6, 2};
        //nums.length ---> 4

        //fori - traditional for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("--------");
        //foreach loop
        // - if you do NOT need specific index
        // if you need to get all the elements from beginning all the way to the ends
        // {4, 24, 6, 2}
        // 1 - int eachElement = 4
        // 2 - int eachElement = 24
        // 3 - int eachElement = 6
        // 4 - int eachElement = 2
        for (int eachElement :nums){

            System.out.println(eachElement);
            //eachElement = 30; this does NOT re-assigning the value
        }

        System.out.println("--------");

        int[] nums2 = new int[5]; // after loop it will be {10, 10, 10, 10, 10}

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = 10;
        }

        System.out.println("--------");

        String[] names = {"Tom", "Jim", "Jack"};

        for (String upperCaseElement: names){
            System.out.println(upperCaseElement.toUpperCase());
        }

    }
}
