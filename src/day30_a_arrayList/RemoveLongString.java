package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Saturday", "Softskills", "Weekend"));
        System.out.println(list);
        System.out.println(removeLongString(list));
        System.out.println(removeContainingA(list));
    }

    public static ArrayList<String> removeLongString (ArrayList<String> list){
        ArrayList<String> list1 = new ArrayList<>(list);
        list1.removeIf(each -> (each.length() > 7));

        return list1;
    }
    public static ArrayList<String> removeContainingA (ArrayList<String> list){
        ArrayList<String> list1 = new ArrayList<>(list);
        list1.removeIf(each -> (each.contains("A")) || (each.contains("a")));

        return list1;
    }
}
