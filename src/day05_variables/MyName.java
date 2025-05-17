package day05_variables;

public class MyName {
    public static void main(String[] args) {
        char l1 = 'f';
        char l2 = 'e';
        char l3 = 'y';
        char l4 = 'r';
        char l5 = 'u';
        char l6 = 'z';

        System.out.println(l1);
        System.out.println("second: " + l2);
        System.out.println("third: " + l3);
        System.out.println("fourth: " + l4);
        System.out.println("fifth: " + l5);
        System.out.println("sixth: " + l6);

        System.out.println();

        System.out.println(l1 + 0);
        System.out.println(l2 + 0);
        System.out.println(l3 + 0);
        System.out.println(l4 + 0);
        System.out.println(l5 + 0);
        System.out.println(l6 + 0);

        System.out.println(l1 + l2 + l3 + l4 + l5 + l6);

        //"feyruz"
        String name = "" + l1 + l2 + l3 + l4 + l5 + l6;
        System.out.println(name);


        char letter1 = 2347;
        System.out.println(letter1);

        char letter2 = 694;
        System.out.println(letter2);

    }
}
