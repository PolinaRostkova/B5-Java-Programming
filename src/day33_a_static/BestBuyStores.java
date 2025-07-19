package day33_a_static;
// runner class
public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy store1 = new BestBuy("123 Main St, Fairfax, VA");
        BestBuy store2 = new BestBuy("456 Test Dr, Rockville, MD");
        BestBuy store3 = new BestBuy("789 Sample Ct, San Joe, CA");

        // since all object will share the same info it is not a good practice to use object reference to call static member of the class
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        System.out.println("-----");
        // All the static members of the class is better to be called by class name
        System.out.println(BestBuy.headquarter);

        System.out.println("-----");
        store1.location = "9821 New St, Chantilly, VA";

        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println("-----");
        store1.headquarter = "111 Java Ave S, CA";

        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        System.out.println("-----");
        BestBuy.headquarter = "222 API Ave S, CA";

        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        System.out.println("-----");
        // Instance members cannot e reached by the class name - we need an object
        // BestBuy.openStore()
        // BestBuy.location = "12 test"

        store1.openStore();
        store2.openStore();
        store3.openStore();

        System.out.println("-----");
        // Static member can be reached by the object reference but don't user
        store1.specialDaySale();

        // the right way to call it with the class name
        BestBuy.specialDaySale();

    }
}
