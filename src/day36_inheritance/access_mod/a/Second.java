package day36_inheritance.access_mod.a;
// Second Class is in the same package with First Class
public class Second extends First{


    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.one);          // public - same PACKAGE  + different class accessible
        System.out.println(first.two);          // protected - same PACKAGE + different class accessible
        System.out.println(first.three);        // default - same PACKAGE + different class accessible
        //System.out.println(first.four);         // private - NOT accessible

        System.out.println();

        Second second = new Second();
        System.out.println(second.one);
        System.out.println(second.two);
        System.out.println(second.three);
        //System.out.println(second.four);
    }
}
