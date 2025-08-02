package day39_a_polymorphism.cloth;
// concrete class
public class TShirt extends Clothes{

    @Override
    public void wearCloth(){ // access modifier in concrete class when overriding should be same or bigger
        System.out.println("Wearing T-Shirt");
    }
}
