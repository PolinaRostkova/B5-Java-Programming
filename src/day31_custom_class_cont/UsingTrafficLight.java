package day31_custom_class_cont;

import java.util.ArrayList;

public class UsingTrafficLight {
    public static void main(String[] args) {
        // Object reference  = object itself
//        TrafficLight street1 = new TrafficLight();
//        //TrafficLight(); --> constructor (non-parametrized)
//
//        // Initialized instance variable "color" for the object street1
//        street1.color = "Yellow";
//        System.out.println(street1.color);

        System.out.println("----------------------");

        TrafficLight streetB = new TrafficLight("Red");
        System.out.println(streetB.color);
        System.out.println("----------------------");
        TrafficLight streetC = new TrafficLight("Green");
        System.out.println(streetC.color);

        ArrayList<Integer>list = new ArrayList<>();
    }
}
