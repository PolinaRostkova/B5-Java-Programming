package day36_inheritance.access_mod.b;

import day36_inheritance.access_mod.a.First;

// is in different package with First and Second Classes
public class Third extends First{
    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.one);          // public - different class + different package accessible
//        System.out.println(first.two);          // protected - NOT accessible different class + different package
//        System.out.println(first.three);        // default - NOT accessible different class + different package
//        System.out.println(first.four);         // private - NOT accessible different class + different package

        System.out.println();
        Third third = new Third();
        System.out.println(third.one);
        System.out.println(third.two);
//        System.out.println(third.three);
//        System.out.println(third.four);
    }
}
