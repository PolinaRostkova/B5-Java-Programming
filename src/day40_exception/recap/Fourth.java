package day40_exception.recap;

public class Fourth {
    public static void main(String[] args) {
        //  --> must be caught or declared to be thrown
        // Options to handle:
        // Option 1: You handle it with try catch -- caught it
        try {
            Thread.sleep(-1000); // InterruptedException --> compile time exception must be caught or declared to be thrown
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("End");

    }
}
