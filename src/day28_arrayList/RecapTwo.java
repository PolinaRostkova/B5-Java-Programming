package day28_arrayList;

import java.util.ArrayList;

public class RecapTwo {
    public static void main(String[] args) {
        ArrayList<String> group2 = new ArrayList<>();
        group2.add("Nina");
        group2.add("Zhala");
        group2.add("Suidum");
        group2.add("Taras");
        group2.add("Gulden");

        System.out.println(group2);

        ArrayList<String> group3 = new ArrayList<>();
        group3.add("Polina");
        group3.add("Jane");
        group3.add("Emin");
        group3.add("Abuzar");
        group3.add("Nilufar");
        System.out.println(group3);

        System.out.println("----------------------------------------");
        System.out.println("First person in Group 2: " + group2.get(0));
        System.out.println("First person in Group 3: " + group3.get(0));

        System.out.println("----------------------------------------");
        System.out.println("Last person in Group 2: " + group2.get(group2.size() -1 ));
        System.out.println("Last person in Group 3: " + group2.get(group3.size() -1 ));

        System.out.println("----------------------------------------");

        for (int i = 0; i < group2.size(); i++) {
            System.out.println("Group2 student no " + (i + 1) + ": " +  group2.get(i));
        }

        System.out.println("----------------------------------------");
        int num = 0;

        for (String eachName : group3){
            System.out.println("Group 3 student: " + ++num + ": " + eachName);

        }

        System.out.println("----------------------------------------");

        group2.remove("Mouse"); // if there was a match and this method also will return boolean because it was successfully removed
        System.out.println(group2);
        group2.remove("nina"); // looking for exact match including case sensitiveness
        System.out.println(group2);

        group2.remove("Nina");
        System.out.println(group2);

        System.out.println("----------------------------------------");
        System.out.println(group3.remove(0)); // this method will remove the given indexed method and return the removed element
        System.out.println(group3);
    }
}
