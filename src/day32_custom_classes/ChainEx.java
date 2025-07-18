package day32_custom_classes;

//custom class
public class ChainEx {

    // first constructor = non parametrized
    public ChainEx(){
        System.out.println("First");
    }

    // 2nd constructor - parametrized
    public ChainEx(int a){
        this(); // has to be FIRST in the constructor
        System.out.println("Second");
    }

    // 3rd constructor - parametrized
    public ChainEx(String str){
        this(2);
        System.out.println("Third");
    }

    // 4th constructor - parametrized
    public ChainEx(boolean b){
        System.out.println("Fourth");
    }
}

/*
    CONSTRUCTOR CHAINING RULES:
        - this(). -- calling another constructor MUST be in the first line of the constructor
        - only one can be called at a time (only can call one constructor in constructor)
        - constructor cannot call itself (infinite loop is the issue)
        - constructor that is called should NOT call back to the current constructor
 */