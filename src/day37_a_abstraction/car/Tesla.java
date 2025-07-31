package day37_a_abstraction.car;
// Non - Abstract class ---> CONCRETE CLASS
public class Tesla extends ElectricCar{
    @Override
    public void start() {
        System.out.println("Starting with keychain");
    }

    @Override
    public void charge() {
        System.out.println("Charging with electric");
    }

    @Override
    public void battery() {
        System.out.println("Battery lasts 2,5 days");
    }
}
