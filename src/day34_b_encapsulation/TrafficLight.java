package day34_b_encapsulation;

public class TrafficLight {
    // custom class

    // instance var
    private String color;

    // constructor
    public TrafficLight(String color) {
       setColor(color);
    }

    // since i have made color var private and if needed we can indirect access
    // with public getter and setter


    // read access only of there is no setter
    public String getColor() {
        return color;
    }

    // i have given indirect access to assign a value with condition
    public void setColor(String color){
        if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green") || color.equalsIgnoreCase("yellow")){
            this.color = color;
        } else {
            System.out.println("Not one of the valid colors.");
        }
    }
}

