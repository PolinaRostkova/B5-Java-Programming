package day26_methods;

import my_util.*;

public class UsingStringUtil {
    public static void main(String[] args) {

        //Calling a method and passing argument "james"
        // this method will return me string
        System.out.println(StringUtil.fixFormat("james"));
        String courceName = StringUtil.fixFormat("loopcamp");
        System.out.println(courceName);

        System.out.println("--------------------------------------");

        System.out.println(StringUtil.uniqueChars("loopcamp"));
        int num = StringUtil.frequencyOfChar("loopcamp", 'o');
        System.out.println(num);

        System.out.println("--------------------------------------");

        System.out.println(StringUtil.reverse("loopcamp"));


    }
}
