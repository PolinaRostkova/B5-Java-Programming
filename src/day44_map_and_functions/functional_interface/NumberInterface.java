package day44_map_and_functions.functional_interface;

@FunctionalInterface // can have only one abstract method
public interface NumberInterface {
    void apply(int a);

}

interface NumberInterfaceReg {
    void apply(int a);
   // regular interface can have more than one abstract method
}

class  A implements NumberInterfaceReg {
    // concrete class and we need to implement all the abstract methods

    @Override
    public void apply(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else  {
            System.out.println("Odd");
        }
    }

}

class B implements NumberInterfaceReg {
    @Override
    public void apply(int a) {
        System.out.println("Cube of " + a + " is: " + a * a * a);
    }
}