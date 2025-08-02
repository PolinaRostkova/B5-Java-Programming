package day39_a_polymorphism.cloth;
// concrete class
public class Jacket extends Clothes implements HasHood{

    @Override
    public void wearCloth(){
        System.out.println("Wearing Jacket");
    }

    @Override
    public void putOnHoody() {
        System.out.println("Putting on hoody");
    }
}
