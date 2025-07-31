package day37_a_abstraction.car;

public class Honda extends Car{

    @Override
    public void start(){
        System.out.println("Starting by inserting the key");
    }
    // child class of abstract parent class has to implement or override parent class abstract method
}
