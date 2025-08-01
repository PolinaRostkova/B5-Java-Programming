package day38_a_abstraction.shopping;

public interface Shipping {
    // constant --> public static final
    String COUNTRY = "USA";

    // public abstract by default
    void shippingCost(boolean hasMembership);
}
