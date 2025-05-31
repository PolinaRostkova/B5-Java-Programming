package day09_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 angles: ");

        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();

        double sunOfAngles = angle1+angle2+angle3;



        //iff all three angles adds up to 180 it is a triangle
        boolean isTriangle = sunOfAngles==180.0;
        //if all the angles adds up to 360. it is a circle
        boolean isCircle = sunOfAngles == 360.0;

        System.out.println("Is it a triangle: "+ isTriangle);
        System.out.println("Is it a circle:   "+ isCircle);

    }
}
