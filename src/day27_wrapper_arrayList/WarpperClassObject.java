package day27_wrapper_arrayList;

public class WarpperClassObject {
    public static void main(String[] args) {
        int a = 2; // primitive data type or variable a (local variable)

        //Integer a2 = new Integer(10); | deprecated --> no longer in use
        Integer a2 = 10; // 10 be default is "int"      --> AUTOBOXING
        Integer a3 = a;  // a holds 2 which is "int"   --> AUTOBOXING

        int a4 = a2;     // assigning Integer to int so we are converting it ---> UNBOXING

        System.out.println(a);  // 2   -  int
        System.out.println(a2); // 10  -  Integer
        System.out.println(a3); // 2   -  Integer
        System.out.println(a4); // 10  -  int

        byte b = 2;   // primitive data type
        Byte b2 = b;  // AUTOBOXING - > going from "byte" int "Byte"

        System.out.println(b);
        System.out.println(b2);

    }
}
