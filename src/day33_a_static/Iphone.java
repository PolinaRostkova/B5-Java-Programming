package day33_a_static;

public class Iphone {
    // Instance variables
    String model;
    double price;

    // Static variables

    static String brand;
    static String operatingSystem;
    static String appleDay;

    // Constructor - initialize all instance variables
    public Iphone(String model, double price){
        this.model = model;
        this.price = price;
    }

    // Instance method
    // can accept both - static and instance
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}' +
               "-------" +
               " Brand: " + brand +
               " OS: " + operatingSystem +
               " Apple day: " + appleDay
               ;
    }


    // Static block - initialize all static variables
    static {
        brand = "Apple";
        operatingSystem = "IOS";
        appleDay = "October 21st";
    }
}
