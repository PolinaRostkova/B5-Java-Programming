package day13_string;

import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {

        // declared OBJECT/NON-PRIMITIVE reference
        // ClassName(dataType - scanner) ReferenceName
        Scanner keyboard; //= new Scanner(System.in);

        // declared OBJECT/NON-PRIMITIVE data type
        // className (dataType - String) referenceName
        String word;

        // declared PRIMITIVE reference
        //dataType - int variableName(variable reference name)
        int num;

        //---------------------------------------------------------

        //There are 2 ways of creating String in Java

        // Option 1 - BY LITERALS ---> simply created String by double quatation " "
        String str1 = "Java";

        // Option 2 - BY "new keyword"
        // String str1 ---> stored in STACK / = new Scanner ---> stored in HEAP
        // If you created BY LITERALS inside of the HEAP we have sections called "String pool". if we already have declared this value we have it stored in String Pool so it points directly to it and does not create a new same one
        // if we create BY NEW keyword ---> it stores DIRECTLY in HEAP. creates a new same value and takes more space in memory



        String str2 = new String ("Java");
        String str3 = "Java";
        String str4 = new String("Java");

        System.out.println(str1); // uppercase Java --> coming from String Pool
        System.out.println(str2); // still uppercase Java --> coming from HEAP
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("-------");
        System.out.println(str1 == str2); // "==" we are comparing the memory location of the String values ---> in this case they have different memory location so "false"
        System.out.println(str1 == str3); // here they both were created by literals and both located in the String Pool ---> so same location "true"
        System.out.println(str2 == str4);
    }
}
