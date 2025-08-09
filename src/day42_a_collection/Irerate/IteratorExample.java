package day42_a_collection.Irerate;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Soft-skills");
        list.add("Selenium");
        list.add("AWS");
        list.add("Database");
        list.add("API");

        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(list);
        System.out.println(list2);

        System.out.println("---------------------------------------------");

        // 1 - Iterator
        Iterator<String> iterator = list2.iterator();
        //    v
        // [Java, Soft-skills, Selenium, AWS, Database, API]
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        //           v
        // [Java, Soft-skills, Selenium, AWS, Database, API]
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        //                         v
        // [Java, Soft-skills, Selenium, AWS, Database, API]
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        //                                v
        // [Java, Soft-skills, Selenium, AWS, Database, API]
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        //                                      v
        // [Java, Soft-skills, Selenium, AWS, Database, API]
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        //                                               v
        // [Java, Soft-skills, Selenium, AWS, Database, API]
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        //                                                  v
        // [Java, Soft-skills, Selenium, AWS, Database, API]
        System.out.println(iterator.hasNext());
        //System.out.println(iterator.next()); // NoSuchElementException --> no element to take

        System.out.println("----------------------------------");
        // Q: reset back to beginning
        iterator = list2.iterator();
        //    v
        // [Java, Soft-skills, Selenium, AWS, Database, API]
        System.out.println("----------------------------------");
        while (iterator.hasNext()) {
            String each = iterator.next();
            if (each.contains("A") || each.contains("a")) {
                iterator.remove();
            }

        }

        System.out.println(list2);

    }
}
