package day30_b_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingAnimal {
    public static void main(String[] args) {

        // declared object reference ad assigned actual object
        Animal animal1 = new Animal();

        System.out.println(animal1.species);
        System.out.println(animal1.population);

        System.out.println("---------------------");
        System.out.println(new Animal().species); // completely new object which i don't have a reference to use later
        System.out.println(new Animal().population);

        System.out.println("---------------------");

        animal1.species = "Birds";
        animal1.population = 100_000_000;

        System.out.println(animal1.species);
        System.out.println(animal1.population);

        System.out.println("---------------------");

        // object reference    = object itself
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Jira"));
        System.out.println(list); // printing the object directly

        System.out.println("---------------------");
        System.out.println(animal1); // if you have not declared toString method in your template class, and you try to print the object directly you will get some memory location

        System.out.println("---------------------");
        Animal animal2 = new Animal();
        System.out.println(animal2);
    }
}
