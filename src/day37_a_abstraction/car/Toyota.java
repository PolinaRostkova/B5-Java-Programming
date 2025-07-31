package day37_a_abstraction.car;

public class Toyota extends Car{

    @Override
    public void start(){
        System.out.println("Starting by pressing the button");
    }
    // child class of abstract parent class has to implement or override parent class abstract method
    // I am giving information on how this method will behave for Child class
}
