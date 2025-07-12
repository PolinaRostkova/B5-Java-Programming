package day30_b_custom_classes;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPeople {
    public static void main(String[] args) {
        // runner class where my execution will start
        String name1; // local variable at method level
       // System.out.println(name); | local variables do NOT have default values

        // can NOT reach those instance variable directly
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(height);
//        System.out.println(isMarried);
//        System.out.println(hasKids);

        // Sample of Object creation
        //reference             = Object
        Scanner key             = new Scanner(System.in);
        String str              = new String("Loopcamp");
        ArrayList<String>list   = new ArrayList<>();
        String[] arr            = new String[4];

        // Creation object of my Custom class - Person
        Person person1          = new Person();
        Person person2          = new Person();
        Person person3          = new Person();
        Person person4          = new Person();
        Person person5          = new Person();
        Person person6          = new Person();
        Person person7          = new Person();

        // now since we have made object of Person class we can use that object reference to reach things inside of that class
        System.out.println("Person 1 Info: ");
        System.out.println(person1.name); // null | getting the default value
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);
        System.out.println(person1.hasKids);

        System.out.println("------------------------");

        System.out.println("Person 2 Info: ");
        System.out.println(person2.name); // null | getting the default value
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);
        System.out.println(person2.hasKids);

        System.out.println("------------------------");

        // assigning the data/info/values to instance variables that belongs to person1
        person1.name = "Polina";
        person1.age = 30;
        person1.height = 5.9;
        person1.isMarried = true;
        person1.hasKids = false;

        System.out.println("------------------------");
        // assigning the data/info/values to instance variables that belongs to person2
        person2.name = "James";
        person2.age = 40;
        person2.height = 6.1;
        person2.isMarried = false;
        person2.hasKids = true;

        System.out.println("Person 1 Info: ");
        System.out.println(person1.name); // null | getting the default value
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);
        System.out.println(person1.hasKids);

        System.out.println("------------------------");

        System.out.println("Person 2 Info: ");
        System.out.println(person2.name); // null | getting the default value
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);
        System.out.println(person2.hasKids);

        System.out.println("------------------------");



    }
}
