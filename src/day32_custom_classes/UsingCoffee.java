package day32_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        // Runner class
        // since there is no custom constructor declared this is using default one
        Coffee coffee1 = new Coffee();

        // if since there is no toString method declared this will print memory location
        // toString method is spacial method which can be implemented to give an object info
        System.out.println(coffee1);

        System.out.println("-----------------");
        // you can call toString method with the object reference but not needed
        //System.out.println(coffee1.toString());

        // Lets assign values to instance variables for 'coffe1' object, without CUSTOM constructor

        // we use the object reference of this class
        coffee1.price = 4.99;
        coffee1.sizeInOz = 16;
        coffee1.brand = "Starbucks";
        coffee1.type = "Black";

        // lets print the object again to see toString method with the initial values for instance variables in 'coffee1' object
        System.out.println(coffee1);

        // lets call our custom instance methods
        coffee1.drink();

        coffee1.refill(1);
        System.out.println(coffee1.sizeInOz);

        coffee1.refill(2);
    }
}
