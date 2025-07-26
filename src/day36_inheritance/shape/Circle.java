package day36_inheritance.shape;

public class Circle extends Shape{
    double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }
}
