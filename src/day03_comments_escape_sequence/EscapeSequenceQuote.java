package day03_comments_escape_sequence;

public class EscapeSequenceQuote {
    public static void main (String[] args){
        /*
        Q: to be able to print we need double quotes. How do we print it itself?
        Ex: Programming language "Java" is a great one.
        We can use ESCAPE SEQUENCE ----> \ (backwords slash)
         */
        // escape sequence -----> it is a backword slash \
        System.out.println("Programming language Java is a great one");
        System.out.println("Programming language \"Java\" is a great one");

        /* Since we use BACKWORD SLASH for double quotes, how do we print backword slash itself?
        Ex: Today is 05\10\2025
         */
        System.out.println("Today is 05 10 2025");
        System.out.println("Today is 05/10/2025"); // it is fine and works
        System.out.println("Today is 05\\10\\2025"); // here we have to put two backwords slash because it has a functionality behind it as an escape sequence

        // How about if i want to print double backword slash?
        System.out.println("Today is 05\\\\10\\\\2025");// we can't put just three of them. some info will be lost

    }
}
