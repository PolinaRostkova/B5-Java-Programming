package day28_arrayList;
/*
    HTML Generator

    Given a String in the following format take the number part of the generator the html tags.
    Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

    Ex:
        Input:
            div^2
        Output:
            <div></div> <div></div>

    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>
 */
public class HTMLGenerator {
    public static void main(String[] args) {
        String str = "div^2";

        System.out.println(htmlGenerator(str));

    }

    public static String htmlGenerator(String str){
        String result = "";

        int indexOfDevider = str.indexOf("^");
        int cycle = Integer.parseInt(str.substring(indexOfDevider + 1));
        String text1 = str.substring(0, indexOfDevider);

        for (int i = 1; i <= cycle ; i++) {
           result = "<" + text1 + "></" + text1 + ">";
        }

        return result;
    }
}
