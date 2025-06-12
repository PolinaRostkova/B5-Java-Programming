package day14_string;

public class Contains {
    public static void main(String[] args) {

        //#8 - "".contains(""); --> will check if ("") this portion is anuwhere in the String. Returns boolean
        String str = "Today's Java topic is all about String methods";

        System.out.println(str.contains("Java topic")); //true --> should be exact match
        System.out.println(str.contains("o")); // true
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains(".")); // false

        System.out.println();

        System.out.println(str.contains("Java") && str.contains("methods") && str.contains("all")); //true

        System.out.println(str.contains("Java && methods")); //false
    }
}
