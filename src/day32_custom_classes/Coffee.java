package day32_custom_classes;
/*

Create a coffee class with these instance variables:
     price, size(oz), brand, types

     ex types: black, cappuccino, latte, mocchiato....

instance methods:

    - make a toString to print all the information of the coffee objects

    - drink(): print: drinking $type type of coffee

    - refill(amount in oz): print refilling x oz
        add the number of oz to the total size

 */
// custom class - Template/Blueprint for objects
public class Coffee {
    /*
        Members of the class
            4 instance variables
            3 instance methods
     */



    // Instance variables
    double price;
    int sizeInOz;
    String brand;
    String type;

    // Instance methods


    @Override
    public String toString() {
        return "Coffee info: " +
                "\n\tPrice:     $" + price +
                "\n\tSize(oz):   " + sizeInOz +
                "\n\tBrand:      " + brand +
                "\n\tType:       " + type;
    }

    public void drink(){ // calling it with coffee1.drink()
        System.out.println("Drinking " + type + " type of coffee");
    }

    public void refill(int size){
        // Max the cup can hold is 18 oz
        if ((sizeInOz + size) <= 18){
            System.out.println("Refilling " + size + " oz...");
            sizeInOz += size;
        } else {
            System.out.println("Your cup if full now. Try later.");
        }
    }
}
