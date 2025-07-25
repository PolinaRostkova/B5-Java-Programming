package day14_string;

public class StartAndEnd {
    public static void main(String[] args) {
        String str1 = "Loopcamp";
        String str2 = "LOOp";

        // #6 - "".startsWith(""); --> will check if starts or not - returns boolean
        System.out.println(str1.startsWith("Loop")); //true
        System.out.println(str1.startsWith("loop")); //false
        System.out.println(str1.startsWith("L")); //true


        // Q: How would you ignore the case sensitiveness and still starts with same characters
        // take str1 ---> make all lower case
        // take "Loop" -> make all lowercase
        // then check if it .startsWith()

        System.out.println( str1.toLowerCase().startsWith( "Loop".toLowerCase() ) ); // "loopcamp" . startsWith("loop")
        System.out.println( str1.toUpperCase().startsWith( "Loop".toUpperCase() ) ); // "LOOPCAMP" . startsWith("LOOP")

        System.out.println(str1.startsWith("Loopcamp")); // true
        System.out.println(str1.startsWith("Loopcamp ")); // false --> there is a space in  the end
        System.out.println(str1.startsWith("   Loopcamp")); // false --> there is a space in the start
        System.out.println(str1.startsWith("   Loop")); // false --> there is a space in the start

        System.out.println();

        String sentence = "Today is Java class day";
        System.out.println(sentence.startsWith("Today ")); //true --> strts with today and space
        System.out.println(sentence.startsWith("Today is Java C")); //true --> stats with today and space
        System.out.println(sentence.startsWith("Today is Java classd")); //false

        //#7 - "".endsWith(""); --> will check if ends or not with exact match - returns boolean
        System.out.println(sentence.endsWith("day")); //true
        System.out.println(sentence.endsWith("ss day")); //true
        System.out.println(sentence.endsWith("ss day")); //true


    }
}
