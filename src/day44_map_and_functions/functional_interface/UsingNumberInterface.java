package day44_map_and_functions.functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {
        A a =  new A();
        a.apply(10);

        B b =  new B();
        b.apply(10);

        System.out.println("-----------------------------------");

        // LAMBDA expression ---->  () -> {};

        NumberInterface evenOrOdd = (num) -> {
           // - if we have TWO or MORE we have to use them
            if (num % 2 == 0) {
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        };

        evenOrOdd.apply(10);
        evenOrOdd.apply(5);

        System.out.println("-----------------------------------");
        NumberInterface calculateCube = num ->
                // - if you have just ONE statement we don't have to use curly brackets
                // - if abstract method have only one argument we can use it without parenthesis
            System.out.println("Cube of " + num + " is: " + num * num * num);


        calculateCube.apply(10);

        /*
            Lambda expression:
                - if you have just ONE statement we don't have to use curly brackets
                - if we have TWO or MORE we have to use them

                - if abstract method have only one argument we can use it without parenthesis
         */
    }
}
