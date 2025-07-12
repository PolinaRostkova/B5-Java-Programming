package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat", "apple"));
        System.out.println(switchPair(list));
    }




    public static ArrayList<String> switchPair(ArrayList<String> list){
        ArrayList<String> copyList = new ArrayList<>(list); // created a new one by copying the list

        if (copyList.size() % 2 == 0){
            for (int i = 0; i < copyList.size(); i += 2) {
                Collections.swap(copyList, i, i+1);
            }
        } else {
            System.out.println("Number of elements are not even");
           copyList =  null;
        }
        return copyList;
    }
}
