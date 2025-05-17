package day03_comments_escape_sequence;

public class EscapeSequenceTabAndNextLine {
    public static void main (String[] args){
        // \t- is for TAB which is equal to 4 spaces from the beginning (only 4 characters in TAB
        System.out.println("This is not tabbed");
        System.out.println("    This is not tabbed");
        System.out.println("        This is not tabbed");

        System.out.println("\tThis is tabbed");
        System.out.println("\t\tThis is tabbed");
        System.out.println("u\t\tThis is tabbed");

        System.out.println();

        // \n---> new line
        System.out.print("This is all about new line with escape sequence. \nHere we used escape sequence\n");
        System.out.println("\nNew Line");
    }
}
