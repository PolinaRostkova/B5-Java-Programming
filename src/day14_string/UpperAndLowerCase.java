package day14_string;

public class UpperAndLowerCase {
    public static void main(String[] args) {

        String day = "Thursday";
        System.out.println(day);

        // #4 - .toUpperCase(); --> converts the String to all upper case and returns String
        System.out.println(day.toUpperCase());
        System.out.println(day.toLowerCase());
        System.out.println(day); // returns the same value that we created
        day = day.toUpperCase(); // here we re-assigned upperCase to be a value so now we will se all upperCase when we print

        // #5 - .toLowerCase
        System.out.println(day);
        day.toLowerCase(); // we made it lowerCase but did not use it (did not re-assign or use in print)
        System.out.println(day);
        System.out.println(day.toLowerCase());
        day = day.toLowerCase();
        System.out.println(day);

        System.out.println();

        String word = "ToDaY Is GoOd DaY#@!";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
    }
}
