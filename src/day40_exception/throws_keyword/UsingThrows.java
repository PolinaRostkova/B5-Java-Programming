package day40_exception.throws_keyword;

public class UsingThrows {
    public static void main(String[] args) {
        wait1(2000);

        try {
            wait2(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void wait1(int milSeconds){
        // Option 1: handle compile time exception
        try {
            Thread.sleep(milSeconds);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void wait2(int milSeconds) throws InterruptedException {
        // Option 2: ByPassing it (Ignoring it) Declare it on method signature

            Thread.sleep(milSeconds);
    }
}
