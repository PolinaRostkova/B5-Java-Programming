package day36_inheritance.access_mod.b;

import day36_inheritance.access_mod.a.First;

public class Fourth extends First{
    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.one);          // public - different class + different package accessible
//        System.out.println(first.two);          // protected - NOT accessible different class + different package
//        System.out.println(first.three);        // default - NOT accessible different class + different package
//        System.out.println(first.four);         // private - NOT accessible different class + different package

        Fourth fourth = new Fourth();
        System.out.println(fourth.one);
        System.out.println(fourth.two);
//        System.out.println(fourth.three);
//        System.out.println(fourth.four);
    }
}
