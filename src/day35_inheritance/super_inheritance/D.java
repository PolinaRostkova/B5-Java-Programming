package day35_inheritance.super_inheritance;
// child class of C
public class D extends C{
    // if parent class has custom constructor, Child class const have to call parent class const

    public D(double d){
        super(d);
    }
}
