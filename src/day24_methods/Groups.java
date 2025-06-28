package day24_methods;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String group2Name1 = "Ayaz";
        String group2Name2 = "Gulden";
        String group2Name3 = "Savlat";
        String group2Name4 = "Yuriy";

        String[] group2Students = {group2Name1, group2Name2, group2Name3, group2Name4}; // single d array

        String[] group3Students = {"Jane", "Polina", "Sultan"}; // single d array

        String[][] groups = {     // multi D array
                group2Students,
                group3Students
        };

        System.out.println("Single D Array group 2: " + Arrays.toString(group2Students));
        System.out.println("Single D Array group 3: " + Arrays.toString(group3Students));

        System.out.println("Multi(2) D Array - groups: " + Arrays.deepToString(groups));

        System.out.println("------------------------------------------------------------------------------");

        //How many elements this 2 d array has
        System.out.println("Multi(2) D Array - size: " + groups.length);

        //How to get  elements from single D array has inside 2 D array
        System.out.println("Single D array from 2 D array: " + Arrays.toString(groups[0]));
        System.out.println("Single D array from 2 D array: " + Arrays.toString(groups[1]));

        //How to get size of single D array
        System.out.println("Single D array from 2 D array - size: " + groups[0].length);
        System.out.println("Single D array from 2 D array - size: " + groups[1].length);

        System.out.println("------------------------------------------------------------------------------");
        String[][] mentorGroups = new String [3][]; // this 2 D array will hold 3 Single D array + each Single D array not set
        String[][] loopcampGroups = new String [4][2]; // this 2 D array will hold 4 Single D array + each Single D array has 3 elements

        System.out.println(Arrays.deepToString(mentorGroups));
        System.out.println(Arrays.deepToString(loopcampGroups));

        String[][] studyGroups = {
                {"Ayaz", "Gulden", "Savlat", "Yuriy" },
                {"Jane", "Polina", "Sultan"}
        };

        System.out.println("------------------------------------------------------------------------------");

        //print each group fro 2d array
        System.out.println(Arrays.toString(studyGroups[0]));
        System.out.println(Arrays.toString(studyGroups[1]));
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < studyGroups.length; i++) {
            System.out.println( Arrays.toString(studyGroups[i]));
        }

        System.out.println("------------------------------------------------------------------------------");

        for (String[] eachString : studyGroups){
            System.out.println(Arrays.toString(eachString));
        }

        System.out.println("------------------------------------------------------------------------------");

        // in every cycle we get single D array starting from the beginning all the way till end
        for (String[] eachString : studyGroups){
            //System.out.println(Arrays.toString(eachString)); // [Jane, Polina, Sultan]
            for ( String eachName : eachString){
                System.out.println(eachName);
            }

            System.out.println("-------------");
        }


    }
}
