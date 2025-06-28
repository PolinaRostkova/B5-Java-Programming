package day24_methods;
/*
unlock car
open the door
sit int the car + close the door
put the seat belt on
start engine
put gear into drive
 */
public class Car {

    public static void unlockCar (){
        System.out.println("Unlocking the car");
    }

    public static void openDoor(){
        System.out.println("Opening the door");
    }

    public static void gettingInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }

    public static void getReady(){
        System.out.println("Putting seat belt on");
        System.out.println("Check the mirrors");
        System.out.println("Put lipstick on");
        System.out.println("Turn the music on");
        System.out.println("Lower the window down");
        System.out.println("Put the destination in navigation");
    }

    public static void starEngine(){
        System.out.println("Start engine");
    }

    public static void drive(){
        System.out.println("Put the gear on D - drive");
        System.out.println("And Drive");
    }

    public static void allStepsToDriveCar(){
        unlockCar();
        openDoor();
        gettingInCar();
        starEngine();
        getReady();
        drive();
    }

    public static void allStepsToDriveCarInRush(){
        unlockCar();
        openDoor();
        gettingInCar();
        drive();
    }


    public static void main(String[] args) {
        // you can call the static method with the CLASS NAME but since it is in the same class/file we cna call it directly
        unlockCar();
        openDoor();

        gettingInCar();

        starEngine();

        getReady();

        drive();

        System.out.println("---------------------------------------------");

        allStepsToDriveCar();

        System.out.println("---------------------------------------------");

        allStepsToDriveCarInRush();
    }
}
