package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        String str = "ABC123$%@456sdf&(*^";
        // String > String[] > ArrayList of String
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("Original: " + list);

        System.out.println("------------------------------------------------------------");

        ArrayList<String> numList = new ArrayList<>(list);
        numList.retainAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
        System.out.println("Numbers: " + numList);

        System.out.println("------------------------------------------------------------");
        ArrayList<String> specials = new ArrayList<>(list);
        specials.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "[", "]", "{", "}"));
        System.out.println("Specials: " + specials);

        System.out.println("------------------------------------------------------------");
        ArrayList<String> letters = new ArrayList<>(list);
        letters.removeAll(numList);
        letters.removeAll(specials);
        System.out.println("Letters: " + letters);

    }
}
