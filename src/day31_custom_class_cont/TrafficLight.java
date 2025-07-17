package day31_custom_class_cont;

public class TrafficLight {
    // RULE 1:
    // - if no explicit constructor declared compiler adds default constructor (hidden)
    // - default constructors are NON-parametrized
    // - default constructor --> className() {....}
    // - public TrafficLight(){...}

    // RULE 2:
    // - if the constructor declare explicitly the compiler does NOT add default one
    //    public TrafficLight(){
    //
    //
    //    }

    String color;

    // creating constructor - declared custom constructor explicitly
    public TrafficLight(String trafficLight){

        color = trafficLight;
    }
}
