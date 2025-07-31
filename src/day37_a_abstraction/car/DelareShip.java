package day37_a_abstraction.car;

public class DelareShip {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
        // abstract class cannot have objects created from it


        Toyota toyota = new Toyota();
        toyota.start();

        Honda honda = new Honda();
        honda.start();

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.charge();
        tesla.battery();
    }
}
