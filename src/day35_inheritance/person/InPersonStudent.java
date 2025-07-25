package day35_inheritance.person;
// custom class
// child of a Student
// InPersonStudent IS-A Student
public class InPersonStudent extends Student {
    public void schoolBus(){
        System.out.println(name + " is taking school bus");
    }
}
