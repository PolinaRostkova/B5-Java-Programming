package day34_c_inheritance.animal;

public class Animal {
    String type;
    int numOfLegs;
    private int age; // private do not inherit to the child

    public void walk(){
        System.out.println(type + " is walking");
    }
}
