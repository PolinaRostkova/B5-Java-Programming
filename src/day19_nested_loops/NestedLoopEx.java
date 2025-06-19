package day19_nested_loops;

public class NestedLoopEx {
    public static void main(String[] args) {

        // print: Hello World
        System.out.println("Hello World");

        // do it with loop
        System.out.println("----------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("*********************");

        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");
        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");
        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");

        System.out.println();
        // outer loop
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Hello Galaxy");

            // inner loop/ nested loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Hello Moon");
            }
        }

        System.out.println("*********************");

        // outer will do 3 times
        for (int i = 0; i < 3; i++) {

            // inner loop will do 6 times
            for (int j = 0; j < 6; j++) {
                System.out.println(10);
            }
            System.out.println();

        }

    }
}
