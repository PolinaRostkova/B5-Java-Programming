package day35_inheritance.pizza;
/*
    create a class called Pizza

    - data:

        size (String), number of toppings

    - constructor

        - create a constructor that creates a Pizza object with the size and the number of toppings

            call setters here

    - encapsulate the Pizza class

        - setter condition:
            size can only be:
                small, medium, or large

            number of toppings must be a positive number

    - other methods methods:

        - calculatePrice()
                calculate the price of the pizza based on:

                    small base: $4
                    medium base: $6
                    large base: $8

                    each topping adds $0.75 to the price

                    calculate the total price and return the cost

        - toString()
            print the size, number of toppings, and cost of the pizza
 */
public class Pizza {
    // instance var
    // private - made them not directly accessible
    private String size;
    private int numOfToppings;

    // constructor
    public Pizza(String size, int numOfToppings) {
        setSize(size);
        setNumOfToppings(numOfToppings);
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("small") || size.equalsIgnoreCase("large")){
            this.size = size;
        }
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings >= 0){
            this.numOfToppings = numOfToppings;
        }
    }
    
    // instance method
    public double calculatePrice(){
        double price = 0; // local var
        if (size == null){
            return 0;
        }
        if (size.equalsIgnoreCase("small")){
            price = 4;
        } else if (size.equalsIgnoreCase("medium")) {
            price = 6;
        } else if (size.equalsIgnoreCase("large")) {
            price = 8;
        }

       return price += numOfToppings * 0.75;
    }


    public String toString() {
        return "Pizza: " +
                "\n\tSize:               " + size +
                "\n\tNumber Of Toppings: " + numOfToppings +
                "\n\tTotal cost:         " + calculatePrice();
    }
}

























