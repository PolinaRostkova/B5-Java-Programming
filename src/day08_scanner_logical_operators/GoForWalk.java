package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main(String[] args) {
        boolean isRaining = false;  //true
        double temperature = -100; //100

        boolean canGoForWalk = !isRaining && temperature > 0;
        System.out.println("Is it good to go for a walk: "+canGoForWalk);
    }
}
