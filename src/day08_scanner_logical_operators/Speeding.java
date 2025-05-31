package day08_scanner_logical_operators;

public class Speeding {
    public static void main(String[] args) {
        int currentSpeed = 30;
        int speedLimitInSchoolArea= 25;
        int allowedOverSpeed = 5;
        boolean isSpeeding = currentSpeed > speedLimitInSchoolArea + allowedOverSpeed;

        System.out.println("The speeding limit in Scholl zone is "+ speedLimitInSchoolArea + " mph. ");
        System.out.println("You are speeding: "+ isSpeeding);
    }
}
