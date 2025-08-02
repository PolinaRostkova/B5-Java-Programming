package day39_a_polymorphism.covariant;


import day35_inheritance.super_inheritance.C;

import java.util.concurrent.Callable;

public class Car {
}

class BMW extends Car{

}

class Tesla extends Car{

}

class Toyota extends Car{
    @Override
    public String toString() {
        return "Toyota{}";
    }
}

class Camry extends Toyota{

}

class Dealership{

    public static void lease(Car car){ // can accept any Car related class so basically its kids
        System.out.println("Leasing a car: " + car.getClass().getName());
    }

    public static void test(String str){

    }

    public static Car getCar(int i){
        if (i == 1){
            return new Toyota();
        } else if (i ==2) {
            return new BMW();
        } else if (i == 3) {
            return new Toyota();
        } else if (i == 4){
            return new Camry();
        } else {
            return new Car();
        }
    }

    public Car checkCar(int i){
        if (i == 1){
            return new Toyota();
        } else if (i ==2) {
            return new BMW();
        } else if (i == 3) {
            return new Toyota();
        } else if (i == 4){
            return new Camry();
        } else {
            return new Car();
        }
    }

    public static String test1(int i){
        return "Hello";
    }
}

class LocationA extends Dealership{
@Override
    public Car checkCar(int i){
        if (i == 1){
            return new Toyota();
        } else if (i ==2) {
            return new BMW();
        } else if (i == 3) {
            return new Toyota();
        } else if (i == 4){
            return new Camry();
        } else {
            return new Car();
        }
    }
}

class Runner{
    public static void main(String[] args) {
        Car car = new Car();

        //Car car1 = new BMW();   // BMW bmw = new BMW();  ---> Car car2 = bmw;   // UP-CASTING / IMPLICIT casting (Automatically)

        Dealership.test("Hello");
        Dealership.test('q' + "");

        System.out.println("---------------");

        Dealership.lease(car);

        Tesla tesla = new Tesla();
        Dealership.lease(tesla);

        System.out.println("---------------");

        System.out.println(Dealership.getCar(1));
        System.out.println(Dealership.getCar(2));
        Car car1 = Dealership.getCar(3);
        Camry car2 = (Camry) Dealership.getCar(4);
    }
}