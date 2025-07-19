package day33_a_static;
// custom class
public class BestBuy {

    // instance var - belong to the object
    String location;


    // constructor

    public BestBuy(String location){
        this.location = location;
    }

    // Static - Every Object will have same copy of info
    // Static - belongs to the class
    // - 601 Penn Ave S, Richfield

    static String headquarter = "601 Penn Ave S, Richfield";
    static String specialDay = "Jul 19th";

    // Instance method

    public void openStore(){
        System.out.println("Opening the store in " + location);
        System.out.println("Our headquarter is " + headquarter);
        // in instance, we can use static
    }

    // Static method
    public static void specialDaySale (){
        System.out.println("There is discount for %40 - %60 on" + specialDay);

        // static always accepts only static so we cannot use instance variables inside the static method

    }

}

/*
    Static:
        - all objects share/have same copy/version
        - if it changes/updates all objects are affected
        - we use Class to reach the static members
             - you can use object reference to reach it but not a good practice
        - static works/accepts only static members

    Instance:
        - every object has its own copy/version
        - uf instance for onr object is changed/updated, it ONLY affects that object
        - we use object reference to reach instance member
            - cannot reach instance var by the Class name
        - instance can work/accept both (static and instance)
 */