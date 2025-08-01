package day38_a_abstraction.shopping;

public class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Buying items from Target.");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");
    }
}
