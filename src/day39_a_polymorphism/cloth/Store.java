package day39_a_polymorphism.cloth;

public class Store {
    public static void main(String[] args) {

        // All references for TShirt = Itself and parent class
        // All references for Jacket = itself, parent, interface

        // 1.1 - Reference side is itself
        TShirt t1 = new TShirt();
        t1.wearCloth();

        // 1.2 - parent class
        Clothes t2 = new TShirt();
        t2.wearCloth();



        System.out.println("-------------------------");

        Jacket j1 = new Jacket();
        j1.wearCloth();

        Clothes j2 = new Jacket();
        j2.wearCloth();

        HasHood j3 = new Jacket();
        j3.putOnHoody();
        //j3.wearCloth();

        System.out.println("-------------------------");

        Object t4 = new TShirt();


    }
}
