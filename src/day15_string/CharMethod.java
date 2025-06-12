package day15_string;

public class CharMethod {
    public static void main(String[] args) {

        String str = "loop";
        //Character   1234
        // Index      0123

        // Index of "l" --> 0
        // Index of "p" --> 3
        // Index of 1st "o" --> 1

        System.out.println("Num of total Characters: " + str.length());

        // #12 - "".charAt(int/index) - gives a char based on the given number at String index -returns char


        System.out.println(str.charAt(0)); // l
        System.out.println(str.charAt(1)); // 0
        System.out.println(str.charAt(2)); // 0
        System.out.println(str.charAt(3)); // p
        //System.out.println(str.charAt(4)); // gives an error because the char is out of bond

        // String charAt0 = str.charAt(0) --> we cannot assign it to String because it returns char
        String charAt0 = "" + str.charAt(0); // we can cast to a String with concatination
        System.out.println(charAt0);

        System.out.println("-------------");
        String sentence = "";
    }
}
