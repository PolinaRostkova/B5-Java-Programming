package day34_a_static;
/*
    Computer - static

    class name: Computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

 */
public class Computer {
    // custom class

    // instance var - each object has its own version
    double price;
    String brand;
    String color;

    // static var - all object share same version
    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    // static block to initialize static var
    static {
        hasScreen = true;
        hasBattery = true;
        hasMemory = true;
    }

    // constructor - to initialize instance var
    public Computer(double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    // toString - is special method to print object directly
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", Has Screen: " + hasScreen +
                ", Has Battery: " + hasBattery +
                ", Has Memory: " + hasMemory +
                '}';
    }
}
