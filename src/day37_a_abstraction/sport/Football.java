package day37_a_abstraction.sport;

public class Football extends Sports{

    // static methods do not get overridden
    // instead they Exact same method signature Static method in Child class hides the one in Parent
    public static void play(){
        System.out.println("Playing from Child class");
    }
}
