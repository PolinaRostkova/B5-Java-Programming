package day24_methods;

public class MyFirstMethod {
    // *method*         ---> a function which is doing or execution set of codes in side of that code block (method body)
    // public           ---> means that this method is accessible everywhere
    // static           ---> we can access to this method by using the CLASS NAME
    // void             ---> this method will do some action - do not return anything
    // main             ---> name of the method
    // (String[] args)  ---> parameters -> single parameter which Single D array
    public static void main(String[] args) {
//        System.out.println("Hello");
//        String part = "Hello".substring(0,3);
        MyFirstMethod.printHello(); // you can also use the class name to call your static method
        printHello(); // the reason we can call the method here directly because this method is in the same class (file) as the main method)
        // look at the LastCharacters file to see the example

        printHello50();

        System.out.println("Break Time");

        printHello(); // we maje the function / code in a block that we can reuse any time we need it
    }

    // My own custom method
    // public       --> accessible everywhere ---> PUBLIC METHOD
    // static       --> can call it with class name --> STATIC METHOD
    // void         --> does NOT return anything / just does action --> VOID METHOD
    // printHello   --> name -> follows same naming rules as variables
    // ()           --> parameters --> NOT parameter ---> NON-PARAMETRIZED method
    public static void printHello(){
        System.out.println("Hello world!");

    }

    public  static void printHello50(){
        for (int i = 1; i <= 50; i++) {
            System.out.println("Hello");
        }
    }

}
