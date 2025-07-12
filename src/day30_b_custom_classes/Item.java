package day30_b_custom_classes;

//Custom class - template
public class Item {
    // instance variables
    String name;
    double price;


    public String toString(){
        String msg = "Item info: \n\tName:  " + name + "\n\tPrice: " + price;


        return msg;
    }
}
