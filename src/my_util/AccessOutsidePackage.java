package my_util;

import day33_b_encapsulation.acces_modifiers.AccessModifiers;

public class AccessOutsidePackage {
    // DIFFERENT package + DIFFERENT class
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a); // "a" has public access modifier so it is reachable anywhere
        //System.out.println(obj.b); // "b" has default access modifier so it is reachable ONLY in SAME package
        //System.out.println(obj.c); // "c" has private access modifier so it is reachable in SAME CLASS
        System.out.println("---------------");
        System.out.println(AccessModifiers.a2);
        //System.out.println(AccessModifiers.b2);
        //System.out.println(AccessModifiers.c2); // private
    }
}
