package day26_methods;

public class Picture {
 /*

        METHOD OVERLOADING
            - Same method name + different parameters (different data type and different order and different number of parameters)
            - happens in the SAME CLASS
            - return type does not affect the method overloading

        -this allows us to change how the methods work when we get different parameter types, but still

        We can NOT have methods with SAME NAME + EXACT SAME DATA TYPE PARAMETERS
        METHOD SIGNATURE - > methodName(); - > NAME + (DATA TYPE PARAMETERS)

     */

    /*
    we can not have methods with same name + exact same dataType parameters
     */
    // NON-PARAMETRIZED METHOD
    public static void draw(){
        System.out.println("Trying to draw");
    }

    // PARAMETRIZED METHOD - accepts 1 string argument / 1 string parameter
    public static void draw(String color){
        System.out.println("Trying to draw with " + color);
    }

   // public static void draw()
    // we already have a method called draw that accepts a String

    public static void draw(String clr, String clr2){
        System.out.println("Trying to paint with " + clr + " and " + clr2);
    }

    public static void draw(int num){
        System.out.println("Trying to draw with " + num + " brushes") ;
    }

    public static void draw(String clr, int num){
        System.out.println("Trying to draw with " + clr + " and "+ num + " brushes");
    }

    // This is a different METHOD SIGNATURE
    // Order of the PARAMETERS - Data Types MATTERS
    public static void draw (int num, String color){
        System.out.println("2 - Trying to draw with " + color + " and with " + num + " brushes"  );
    }

    // There is no method overloading between "paint" and "draw" methods
    // but there is Method Overloading between "paint" method s
    public static void paint (String str) {

    }

    public static void paint (String str, String str2) {

    }



}
