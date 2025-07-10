package my_util;

import java.util.ArrayList;

public class ArrayListUtil {

    /**
     * this method checks if the given element in the ArrayList with IgnoringCase
     * @param arrList is fiven ArrayList
     * @param element is given element
     * @return boolean true/false if there is a match or no match
     */
    public static boolean containsIgnoreCase(ArrayList<String> arrList, String element){
        boolean hasElement = false;
        for (String eachElement : arrList){
            if (element.equalsIgnoreCase(element)){
                hasElement = true;
                break;
            }
        }
        return hasElement;
    }
}
