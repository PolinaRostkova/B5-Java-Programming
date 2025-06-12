package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "new method";

        System.out.println(str.isEmpty()); //false --> it has some characters so NOT empty
        System.out.println(str.length() != 0);

        System.out.println();

        str = "";
        System.out.println(str.isEmpty()); //true --> we re-assigned it to be empty
        System.out.println(str.length());
        System.out.println(str.length() == 0 ); // true --> there is not characters now

        System.out.println();

        str = " ";
        System.out.println(str.isEmpty()); //false --> we have a character there which is space
        System.out.println(str.length()); // 1 --> we have only one space

        System.out.println(str.isBlank()); // it checks if String is only made out of spaces "  "
    }
}
