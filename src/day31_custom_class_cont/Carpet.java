package day31_custom_class_cont;
//BluePrint or Template of how each object of this class will behave
public class Carpet {

    // Instance variables
    double width;
    double length;
    double unitPrice;
    double totalPrice;

    // Make a rule that when object is created it is required to provide initial values or instance variables

    public Carpet(double width1, double length1, double unitPrice1){
        width = width1;
        length = length1;
        unitPrice = unitPrice1;
        calculateTotalPrice();
    }

    public void calculateTotalPrice(){
        totalPrice = length * width * unitPrice;
    }
    public String toString() {
        return "Carpet info" +
                "\n\tWidth:         " + width +
                "\n\tLength:        " + length +
                "\n\tUnit Price:    " + unitPrice +
                "\n\tTotal Price:   " + totalPrice;
    }
}
