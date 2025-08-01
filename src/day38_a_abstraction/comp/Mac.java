package day38_a_abstraction.comp;

public interface Mac {
    // everything in interface is public
    // all var are public static final --> constants
    // all the methods without body be default public abstract
    // cannot have constructor - not even a default
    // cannot have any blocks (static block)
    // can have static and default method

    // 1 - Constants: public static final
    String NAME = "Apple";
    String OS = "IOS";

    // 2 - abstract methods: public abstract
    void turnOn();

    // 3 - public Static method
    static void company(){
        System.out.println("Company name: " + NAME);
        System.out.println("Operating system: " + OS);
    }

    // 4 - default method
    public default void faceTime(){
        System.out.println("Calling through FaceTime");
    }
}
