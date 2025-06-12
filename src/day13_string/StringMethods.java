package day13_string;

public class StringMethods {
    public static void main(String[] args) {

        String name1 = "Tom"; // by literals ---> inside String Pool
        String name2 = "Tom"; // by literals ---> inside String Pool
        String name3 = new String("Tom"); // by new keyword ---> inside the HEAP directly

        System.out.println(name1 == name2); //true
        System.out.println(name1 == name3); // false
        System.out.println(name2 == name3); // false --> we are comp memory location
        System.out.println("---------------------");
        // #1 - .equals(); --> this will compare the String VALUE (including the case sensitiveness)

        System.out.println(name1.equals(name2)); // true
        System.out.println(name1.equals(name3)); // true --> comp VALUES itself / "Tom" = "Tom" = true

        System.out.println("Tom".equals(name1)); // true --> we are using the data directly but still string
        System.out.println(name3.equals("Tom")); // true --> the same using the String directly

        String name4 = new String("TOM");
        System.out.println(name1.equals(name4)); // false ---> "Tom" = "TOM" = false, since they are not the same

        System.out.println(new String("TOM").equals(name4)); // true --> "TOM" - "TOM" = they are the same with uppercases so it is true

        boolean isN1SameAsN3 = name1.equals(name3);
        System.out.println(isN1SameAsN3);

        //Q: How can we compare by IGNORING the CASE SENSITIVENESS?
        // #2 - .equalsIgnoreCase(); this will compare the String value (excluding the case sensitiveness)
        System.out.println("----------------------");
        String str1 = "Wed";
        String str2 = "WED";

        System.out.println(str1.equals(str2)); // false --> tey are not the same
        System.out.println(str1.equalsIgnoreCase(str2)); // true --> here we don't care if they are uppercase or lowercase as long as they mean the same thing
        System.out.println("------------------------");
        //Q: How can I get how many characters we have in the String
        // 3# - .length(): this will give us the number of the total characters (including space)
        String sentence = "I love Java";
        System.out.println(sentence.length());

        sentence = "Loopcamp has SDET program. It lasts for 6 months.";
        System.out.println(sentence.length());

        int numOfCharInSentence = sentence.length();
        System.out.println(numOfCharInSentence);



    }
}
