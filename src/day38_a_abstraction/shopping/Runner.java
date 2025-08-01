package day38_a_abstraction.shopping;

public class Runner {
    public static void main(String[] args) {
        Target shop1 = new Target();
        shop1.buyItem();
        shop1.returnItem();
        System.out.println(shop1.price);
        // Target.COUNTRY | no relation between them
        System.out.println(Shipping.COUNTRY);
        System.out.println(OnlineShopping.COUNTRY); // they all have relation so we can reach it
        System.out.println(Amazon.COUNTRY);

        System.out.println();

        // abstract class cannot have the objects
//        OnlineShopping oS = new OnlineShopping();
        Amazon a = new Amazon();
        System.out.println(a.price);
        a.buyItem();
        a.returnItem();
        a.deliveryEstimate();
        a.shippingCost(true);

    }
}
