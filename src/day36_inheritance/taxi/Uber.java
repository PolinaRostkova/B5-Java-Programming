package day36_inheritance.taxi;

public class Uber {

    String driverName;

    public Uber(String driverName) {
        this.driverName = driverName;
    }

    public double calculatePrice(int miles){
        double totalPrice = 0;
        totalPrice += miles * 2.5;
        return totalPrice;
    }
}
