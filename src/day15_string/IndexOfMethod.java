package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "oppen door";
        //            01234 --> indexes
        char firstChar = str.charAt(0); // get the first  one character at index of 0

        // can you fnd the index number of 'p'

        System.out.println(str.indexOf('p')); //0 - the index of the 'p' is 0
        System.out.println(str.indexOf("p"));
        System.out.println();
        System.out.println(str.indexOf("pen"));
        System.out.println(str.indexOf(" "));

        System.out.println("-----------------------------------------");
        String str2 = "penen";

        System.out.println(str2.indexOf('e')); // one argument which is char
        System.out.println(str2.indexOf("en")); // one argument which is String

        System.out.println(str2.indexOf('e',1)); //two arguments which are char and int
        System.out.println(str2.indexOf("en", 2));

        System.out.println("-----------------------------------------");
        String sentence = "Saturday is first weekend day and we have Java classes on Saturday. Saturday is better than Sunday";
        //find me 2nd Saturday

        System.out.println(sentence.indexOf("Saturday"));
        System.out.println(sentence.indexOf("Saturday", 1));

    }
}
