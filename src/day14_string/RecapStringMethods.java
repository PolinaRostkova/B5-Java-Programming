package day14_string;

public class RecapStringMethods {
    public static void main(String[] args) {

        //Declared String reference =
        String str1 = "loop";  // BY LITERALS
        String str2 = "loop";  // by literals
        String str3 = new String("loop");  // by 'new' key word
        String str4 = new String("loop");  // by 'new' key word

        // Comparing with '=='
        System.out.println(str1==str2); // true --> they are pointing to exact memory location
        System.out.println(str1==str3); // false ---> 2 different locations str1 is in the String Pool and str3 is in the Heap
        System.out.println(str3==str4); // false ---> they both in the Heap memory location  but since we used 'new' key word we created two different values


        System.out.println("-----------------");


        // "".equals(""); ---> compares the value (exact characters)
        System.out.println(str1.equals(str2));   //true
        System.out.println(str1.equals(str3));   //true
        System.out.println(str3.equals(str4));   //true
        System.out.println("loop".equals(str3)); //true
        System.out.println(str1.equals("loop")); //true

        System.out.println(new String("loop").equals("loop")); //true
        System.out.println("loop".equals(new String("loop"))); //true
        System.out.println(new String("loop").equals(new String("loop"))); //true
        System.out.println("loop".equals("loop")); //true

        boolean resultOfEqualsMethod = str1.equals(str2);
        System.out.println(resultOfEqualsMethod);
        System.out.println();


        //"".equalsIgnoreCase(""); ---> compares the value (characters without case sensitiveness)
        String str5 = "Loop";

        System.out.println(str1.equalsIgnoreCase(str5)); //true --> ignores case and as long as it says the same thing it will be true

        boolean compareWithoutCaseSensitiveness = "LoOp".equalsIgnoreCase(str5);
        System.out.println(compareWithoutCaseSensitiveness); // true

        if (compareWithoutCaseSensitiveness){
            System.out.println("These two string values are same without case sensitiveness");
        } else {
            System.out.println("These two string values are NOT same without case sensitiveness");

        }

        System.out.println();

        //"".length(); ---> counts how many characters there are and returns INT
        System.out.println(str1.length()); // 4
        str1 = str1 +"camp"; // we made a new String. String is IMMUTABLE
        System.out.println(str1.length()); // 8

        int num = 10;
        System.out.println((""+10).length()); // ---> "10".length(); --> gives us 2 since 10 is a String now and we have 2 characters there

        String str6 = "Loop";
        //write a code that checks if the word has even or odd number characters
        int howManyChar = str6.length();
        if ((howManyChar % 2) ==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
