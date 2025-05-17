package day06_b_unary_operators;

public class Store {
    public static void main(String[] args) {
        String storeName = "Costco";
        int numberOfTV = 100;

        System.out.println("In "+storeName+" we have "+numberOfTV+" TV's");
        System.out.println("Someone came and put 1 TV in the cart and this person is still in the store and in stock we have " +numberOfTV--+ " TV left");
        // 10 min later he paid
        System.out.println("Now in stock we have "+numberOfTV+" TV left");

        System.out.println("That same customer returned the TV back and now in stock we have "+ ++numberOfTV+ " TV");

    }
}
