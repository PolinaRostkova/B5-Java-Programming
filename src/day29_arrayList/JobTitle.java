package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitle {
    public static void main(String[] args) {
        // .addAll(collection);
        // .addAll(index, collection);
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "QE", "Developer", "BA", "SM", "PO", "PM"));
        System.out.println(jobTitles);

        System.out.println("----------------------------------------------------------------------");
        // .removeAll(collection); --> removes all given elements st the all match from the list, Case sensitive so takes ONLY exact metches

        //jobTitles.removeAll("QA", "SDET", "QE") | not valid
        jobTitles.removeAll(Arrays.asList("qa", "PO", "QE", "BA"));
        System.out.println(jobTitles);

        System.out.println("----------------------------------------------------------------------");
        // ,retainsAll(collection); --> remove all other exapt the given one | keep the matching ones only and remove all others
        jobTitles.retainAll(Arrays.asList("QA", "SDET", "Developer", "BA"));
        System.out.println(jobTitles);

        System.out.println("----------------------------------------------------------------------");
        // .containsAll(collection); --> checks if all the given collection is in your ArrayList
        System.out.println(jobTitles.containsAll(Arrays.asList("QA", "SDET")));
        System.out.println(jobTitles.containsAll(Arrays.asList("QA", "SDET", "PM")));

    }
}
