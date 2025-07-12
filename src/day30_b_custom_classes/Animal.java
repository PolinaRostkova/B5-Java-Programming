package day30_b_custom_classes;

public class Animal {
    String species;
    int population;


    // Instance method
    // .toString() - special method
    // will help us to print the object directly
    public String toString(){
        String message = "Species: \t" + species + "\nPopulation: " + population; // local variable
        return message;
    }
}
