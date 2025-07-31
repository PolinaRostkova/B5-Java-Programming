package day37_a_abstraction.book;
// interface similar to class
// it is another way of achieving abstraction
// public --> is the only available access modifier in interface
public interface Prints {
    // all the variables inside the interface are ALWAYS public static final
    // constant variables
    String NAME = "Java";

    // By default, the methods are public abstract
    //public abstract void read();
    void read();
    void write();

    // since we can have variables, there is static method available in interface
    public static void sayBye(){ // static method in interface is not inherited to child
        System.out.println("Name is " + NAME);
    }

    default void sayHi(){ // can call only with the object, gets inherited to the child class
        System.out.println("Hi");
    }
}