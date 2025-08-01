package day38_a_abstraction.shopping;
// concrete
public class Amazon extends OnlineShopping {

    @Override
    public void deliveryEstimate() {
        System.out.println("Amazon delivery estimate");
    }

    @Override
    public void shippingCost(boolean hasMembership) {
        if (hasMembership){
            System.out.println("Your shipping is free");
        } else {
            System.out.println("Your shipping cost is 5.99$");
        }
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon");
    }
}
