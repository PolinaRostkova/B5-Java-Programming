package day23_multi_dem_arrays;
/*
 Printout this format for each zone
 $app is deploying on $zone

    loopcamp is deploying on us-east1
    loopcamp is deploying on us-west1
    loopcamp is deploying on us-north1
    loopcamp is deploying on us-south1
 */
public class AWS {
    public static void main(String[] args) {
        String appName = "loopcamp";
        String awsZones = "us-east1, us-west1, us-north1, us-south1";

        String[] zones = awsZones.split(", "); // here we already have an array with 4 elements in it

        for (String eachEl : zones){
            System.out.println(appName + " is deploying on " + eachEl);
        }

    }
}
