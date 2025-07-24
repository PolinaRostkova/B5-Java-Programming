package day34_b_encapsulation;

public class Road {
    public static void main(String[] args) {
        TrafficLight intersectionA_TL1 = new TrafficLight("Yellow");
        // System.out.println(intersectionA_TL1.color); // since it is private now we cannot access like this anymore
        // we can use the getter (if available)
        System.out.println(intersectionA_TL1.getColor());
        /*
        .
        .
        .
        .
        .
        .
        .
        .
        .
        .
         */
        //intersectionA_TL1.color = "Pink";
        // since there are only 3 valid colors it would be good idea to not give direct access so nobody can assign anything other than valid colors
        //System.out.println(intersectionA_TL1.color);

        intersectionA_TL1.setColor("pink");
        System.out.println(intersectionA_TL1.getColor());


        TrafficLight intersectionB_TL2 = new TrafficLight("pink");
        System.out.println(intersectionB_TL2.getColor());
    }
}
