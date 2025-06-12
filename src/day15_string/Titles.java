package day15_string;

import java.util.Scanner;

/*

    create a class Title
    ask the user to enter their name including titles
    use the following titles to determine how to refer to the person as

    handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

        titles: [starts]

            Mr or Mister ---> Mr. Tom
            Ms or Miss or MS or Madam  -- > Hello Ma'am
            Dr

        and some titles can come after a name: [ends]

            Sr
            Jr

    Based on both starting and ending titles print the following messages:
     Mr or Mister: Hello Sir
            Ms or Miss or Madam: Hello Ma'am
            Dr: Hello Doctor

            Sr: Nice to meet you Senior
            Jr: Nice to meet you Junior

    Note: It is possible to have both beginning and ending titles, one of them, or none of them
 */
public class Titles {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your name with title: ");
        String useName = key.nextLine().toLowerCase();


        if (useName.startsWith("mr.") || useName.startsWith("mister")){
            System.out.println("Hello Sir");
        } else if (useName.startsWith("ms.") || useName.startsWith("miss") || useName.startsWith("madam")) {
            System.out.println("Hello Ma'am.");
        } else if (useName.startsWith("dr.")){
            System.out.println("Hello Doctor.");
        }

        if (useName.endsWith(" sr")){
            System.out.println("Nice to meet you Senior.");
        } else if (useName.endsWith(" jr")) {
            System.out.println("Nice to meet you Junior");
        }

    }
}
