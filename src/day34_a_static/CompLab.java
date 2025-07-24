package day34_a_static;

public class CompLab {
    // runner class
    public static void main(String[] args) {
        Computer computer1 = new Computer(999.99, "Dell", "Silver");
        System.out.println(computer1);

        Computer computer2 = new Computer(1299.99, "HP", "Black");
        System.out.println(computer2);

        System.out.println("--------------------------------------------------------------------");

        // use object itself to reach instance evar of the class
        System.out.println(computer1.price);
        System.out.println(computer2.color);

        // use class name to reach static members of the class
        System.out.println(Computer.hasBattery);

        System.out.println("--------------------------------------------------------------------");

        computer1.price = 699.99;
        System.out.println(computer1.price); // 699.99
        System.out.println(computer2.price); // 1299.99

        System.out.println("--------------------------------------------------------------------");

        computer1.hasScreen = false; // no metter if we are calling it be the obj nam or class name still affects the whole objects of the class
        System.out.println(computer1.hasScreen); // false -- do not use this way to call this data
        System.out.println(computer2.hasScreen); // false

        // right way
        System.out.println(Computer.hasScreen); // good way to call static members since they belong to the class NOT to the object
    }
}
