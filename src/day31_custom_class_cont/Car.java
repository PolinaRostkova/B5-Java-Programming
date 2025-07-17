package day31_custom_class_cont;
/*
    Create a class Car

    create instance variables:
    model, year, color, fuel level (percent number)

    create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true if the gas level is below 25
            otherwise return false

    Create a separate class to create Car objects and test the methods created
 */
public class Car {

    // Instance variables - belongs to each object of this class (each object has its own copy of these variables)

    String model;
    int year;
    String color;
    double fuelLevel;

    // Instance methods
    // - belongs to objects ( each object will run its own version - if instance methods are used)
    // - instance methods do not have static


    @Override
    public String toString() {
        String msg = "Car info: "
                + "\n\tModel: " + model
                + "\n\tYear: " + year
                + "\n\tColor: " + color
                + "\n\tFuel level: " + fuelLevel;

        return msg;
    }


    public void drive (){
        System.out.println("Driving " + model);
    }

    public void fillTank(){
        System.out.println("Filling tank");
        fuelLevel = 100;
    }

    public boolean isLow(){

        return fuelLevel < 25;
    }

}
