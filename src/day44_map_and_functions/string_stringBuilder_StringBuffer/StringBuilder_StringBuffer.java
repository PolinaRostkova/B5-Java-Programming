package day44_map_and_functions.string_stringBuilder_StringBuffer;

import my_util.StringUtil;

public class StringBuilder_StringBuffer {
    public static void main(String[] args) {
        // 1- String
        //      - immutable
        //      - we can create by literals and by new keyWord
        String str1 = "loopcamp";               // stored in Heap ---> String Pool
        System.out.println("String: " + str1);  // We created a new string. the other one is NOT changed

        String str2 = new String("loopcamp");   // Stored directly in the heap
        str2 = str2 + " " + str2;                      //  We created a new string. the other one is NOT changed
        System.out.println("String: " + str2);
        System.out.println(StringUtil.reverse(str2));

        System.out.println("===================================");
        // 2 - StringBuilder
        //          - mutable - original value can change
        //          - can create only by new keyword
        //          - NOT thread safe or synchronized
        StringBuilder sb = new StringBuilder("loopcamp");   // Stored directly in the heap
        System.out.println("StringBuilder: " + sb);
        sb.append(" course");               // we changed the original String
        System.out.println("StringBuilder: " + sb);

        System.out.println("===================================");
        // 3 - StringBuffer
        //          - mutable - can be changed
        //          - created only by new keyword
        //          - thread safe or synchronized
        //          - It is an older version of StringBuilder
        StringBuffer sbf = new StringBuffer("loopcamp");   // Stored directly in the heap
        System.out.println("StringBuffer: " + sbf);
        sbf.reverse();
        System.out.println("StringBuffer: " + sbf);

    }
}
