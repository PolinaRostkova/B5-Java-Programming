package day36_inheritance.taxi;

import day36_inheritance.access_mod.a.First;

public class UberX extends Uber{

    public UberX(String driverName){
        super(driverName);
    }

    // lixury uberX -- 20% more than regular
    public double calculatePrice(int miles){
        double totalPrice = 0;
        totalPrice = super.calculatePrice(miles) * 1.2;

        return totalPrice;
    }

//    public void test(){
//        super.calculatePrice(10); // to call method from the parent class
//    }
}

/*
    this ----- >  to reach same class memers (instance var + instance meth)
    this() --- >  to call another constructor in the same class

    super ----- >  to reach parent class memers (instance var + instance meth)
    super() --- >  to call parent constructor
 */
