package day32_custom_classes;
/*
    create a class called Food

       - data:
           name, quantity, unit price, total price

    - constructor

        - create a constructor that creates a Food object with the name

        - create a constructor that creates a Food object with the name and quantity

        - create a constructor that creates a Food object with the name, quantity, and unit price
            -> call calculatePrice() method here

    - method:

        - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

        - toString()
            print all the Food information
*/
// custom class - template for objects of this class how to behave
public class Food {

    // Instance variables
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    // constructor with 1 parameter
    public Food (String name){
        this.name = name;
    }
    // constructor with 2 parameters - name, quantity
    public Food (String name, int quantity){
        //this.name = name;
        this(name);
        this.quantity = quantity;
    }
    // constructor with 3 parameters - name, quantity, unitPrice
    public Food(String name, int quantity, double unitPrice) {
//        this.name = name;
//        this.quantity = quantity;
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculateTotalPrice();
    }

    // Instance method
    public void calculateTotalPrice(){
        totalPrice = quantity * unitPrice;
    }
    // Instance method - special one - toString()
    public String toString(){
        return "Food Info: " + name + ": " + quantity + " * " + unitPrice + " = " + totalPrice;
    }

}
