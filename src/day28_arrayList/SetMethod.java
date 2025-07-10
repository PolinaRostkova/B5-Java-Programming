package day28_arrayList;

import java.util.ArrayList;

public class SetMethod {
    /*
    ArrayList methods:
            .size();
            .add(element);
            .add(index, element/data);
            .get(index);
            .isEmpty()
            .contains()
            .remove(byObject)
            .remove(byIndex)
            .clear();
            .set();


            ArrayList on the background Array
            - size is NOT fixed
            - works with object type data
            - internally uses Array
            - keeps insertion order
            - allows duplicate elements
 */
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Fairfax");
        cities.add("Raleigh");
        cities.add("Frederick");
        cities.add("Centreville");
        System.out.println(cities);

        System.out.println("---------------------");
        //Change the first city to be Arlington
        cities.set(0, "Arlington");
        System.out.println(cities);

//        cities.set(10, "DC"); // IndexOutOfBoundsException
//        System.out.println(cities);

        // Change the last city to be Chantilly

        cities.set(cities.size() - 1 , "Chantilly");
        System.out.println(cities);

        System.out.println("---------------------");

        System.out.println(containsIgnoreCase(cities, "dc"));
        System.out.println(containsIgnoreCase(cities, "DC"));
        System.out.println(containsIgnoreCase(cities, "fairfax"));
        System.out.println(containsIgnoreCase(cities, "raleigh"));
    }

    public static boolean containsIgnoreCase(ArrayList<String> arrList, String element){
        boolean hasElement = false;

        for (String eachElement : arrList){
            if (eachElement.equalsIgnoreCase(element)){
                hasElement = true;
                break;
            }
        }
        return hasElement;
    }
}
