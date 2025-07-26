package day36_inheritance;

public class Main {

}

class Parent{
    public final void walk(){
        System.out.println("Walking from parent class..."); // final class cannot be overridden
    }

    // Q: can i overload it
    // yes, overloading happens in the same class

    public final void walk(int miles){
        System.out.println("Walking from the parent " + miles); // final methods we can overload but not override
    }

    public void wolf(String name, int miles){
        System.out.println("walk");
    }
}

class Child extends Parent{
//    public final void walk(){
//        System.out.println("Walking from child class..."); // final class cannot be overridden
//    }

//    public void walk(int miles){
//        System.out.println("Walking from the parent " + miles); // final methods we can overload but not override
//    }

    @Override
    public void wolf(String name, int miles){
        System.out.println("walk"); // not final and different version of the overloaded method
    }
}

class A { }

class B extends A{ }

final class C extends B { }

// since class C is final cannot have any child classes
// D extends C { }

class E extends B { }
