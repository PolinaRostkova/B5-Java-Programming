package day33_b_encapsulation.acces_modifiers;

public class AccessModifiers {
    // Access Modifiers:
        // Public       - reachable anywhere
        // "default"    - reachable same package
        // private      - reachable only in the same class


    // Instance Variables -- applying access modifiers to instance var
    public int a;       // public access modifier
    int b;              // default access modifier(when we don't have anything in front of the int
    private int c;      // private access modifier
    //protected int d;  // protected access modifier ---> we will talk later

    // Static Variables -- applying access modifiers to static var
    public static int a2;       // public access modifier
    static int b2;              // default access modifier(when we don't have anything in front of the int
    private static int c2;      // private access modifier
    //protected static int d;   // protected access modifier ---> we will talk later

    // SAME package + SAME class
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a); // "a" has public access modifier so it is reachable anywhere
        System.out.println(obj.b); // "B" has default access modifier so it is reachable ONLY in SAME PACKAGE
        System.out.println(obj.c); // "C" has private access modifier so it is reachable in SAME CLASS

        System.out.println("---------------");
        System.out.println(AccessModifiers.a2); // public
        System.out.println(AccessModifiers.b2); // default
        System.out.println(AccessModifiers.c2); // private
    }
}
