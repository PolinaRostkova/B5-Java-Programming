package day25_methods_void_and_return;

import my_util.StringUtil; // this will import StringUtil class from my Util package

/*
    Fix Format

    create a method will accept a String and return a String in proper format.
    Proper format is:
        First character starting as uppercase and the rest as lowercase

    Ex:
    Input:
        jamES

    Output:
        James

 */
public class FixFormat {
    public static void main(String[] args) {

        System.out.println(fixFormat("pOLinA")); // calling a method which is directly in this class

        System.out.println(StringUtil.fixFormat("JAMES")); // i am calling a method which is in StringUtil clas (is my_util package)
    }
    //todo: handle the case where this method does not accept more than one word

    public static String fixFormat (String word){

        String fixed = "";

        fixed = ("" + word.charAt(0)).toUpperCase() + word.substring(1).toLowerCase();
        return fixed;
    }

}

/*
when our reusable method is in a different package, we need to import it
And if your method is "static" method, we use the Class name to call it
 */
