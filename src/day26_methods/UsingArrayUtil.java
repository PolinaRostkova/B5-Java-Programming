package day26_methods;
import my_util.*;
public class UsingArrayUtil {
    public static void main(String[] args) {

        int[] nums = { 23, 54, 65, 234, 754, -23, 453};

        System.out.println(ArrayUtil.minNumInArr(nums));

        System.out.println(ArrayUtil.minNumInArr(new int [] {23, 54, 643, 2345}));

        System.out.println("--------------------------------------------------");

        String str = "loopcamp";
        System.out.println(str.contains("o"));

        System.out.println(ArrayUtil.contains(nums, 1));

        System.out.println("--------------------------------------------------");


        String[] words = {"java", "softskills", "mentors"};
        System.out.println(ArrayUtil.contains(words, "java"));

        System.out.println("--------------------------------------------------");

        System.out.println(ArrayUtil.indexOf(words, "mentors"));
    }
}
