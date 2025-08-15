package day44_map_and_functions.functional_interface;

public class UsingDynemicFunctionalInterface {
    public static void main(String[] args) {
        // lambda expression () -> {}

        DynemicFunctionalInterface <String>printChars = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };

        DynemicFunctionalInterface <Integer> printInts5Times = (num) -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(num);
            }
        };

        printChars.test("Loopcamp");
        System.out.println();
        printInts5Times.test(5);

    }
}
