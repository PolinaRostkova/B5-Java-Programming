package day22_arrays;

import java.util.Arrays;

public class JoinEx {
    public static void main(String[] args) {
        String[] strArr = {"a ", "B", "C"};
        System.out.println("Before join: " + Arrays.toString(strArr));


        System.out.println(String.join("-", strArr)); // this whole thing becomes one String a-B-C
        System.out.println(String.join("<>", strArr)); // this whole thing becomes one String a<>B<>C
        System.out.println(String.join("****", strArr)); // this whole thing becomes one String a****B****C

        String join1 = String.join("@", strArr);
        System.out.println(join1);
    }
}
