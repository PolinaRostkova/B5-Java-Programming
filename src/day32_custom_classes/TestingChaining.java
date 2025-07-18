package day32_custom_classes;

// runner class
public class TestingChaining {
    public static void main(String[] args) {
        ChainEx obj1 = new ChainEx();
        System.out.println();
        new ChainEx();

        System.out.println();
        new ChainEx(2);

        System.out.println();
        new ChainEx("2");

        System.out.println();
        new ChainEx(false);

    }


}
