package day30_b_custom_classes;
// building a class/blueprint/template which gives instruction for each object for each object
public class App {

    // instance variables and belongs to each object. each object has its own copy of these
    // adding some instance methods
    String name;
    double version;
    boolean isFree;
    int reviews;

    // instance methods - also belongs to each object.
    // should NOT have static keyword
    // called NON-static method
    public void run(){
        System.out.println(name + " is running...");
    }

    public void update (){
        System.out.println(name + " is updating...");

        version += 1;
    }
}
