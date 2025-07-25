package day35_inheritance.person;

public class Student extends Person{
//    String name;
//    int age;
    // Student IS-A Person --> IS-A relation / Inheritance / Parent Child / Super Sub relation
    boolean hasUniform;


//    public void talk(){
//        System.out.println(name + " is talking.");
//    }

    public void wears(){
        System.out.println(name + " is having uniform: " + hasUniform);
    }
}
