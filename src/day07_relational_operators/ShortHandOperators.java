package day07_relational_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int a = 10;         //declared and initialized (assigned first value) variable called 'a'
        a = 20;             // re-assigned variable 'a' into a new value
        a++;                // still re-assigned by POST increment(increasing value by 1) --> a = a + 1 = 21;
        ++a;                // re-assigned by PRE increment still increasing value by 1; a = 22;
        a = a +1;           // re-assigned by increasing value by 1 ----> a = a + 1 = 23;


        a = a + 10;         // re-assigned by adding by 10 ---> a = a(23) + 10 = 33
        System.out.println(a);
        a+= 10;            // re-assigned by shorthand operator adding 10
        System.out.println(a);

        //a = 100 + 10;    // shorthand operators can add or substruct only to or from itself

        System.out.println();

        int b = 10;
        b *=2;              // re-assigned by using shorthand operators multiplying itself by 2 ---> b = b * 2;

        System.out.println(b);
        System.out.println();

        int c = 20;
        c -=5;
        System.out.println(c);
        System.out.println();

        int d = 5;
        d /= 2;
        System.out.println(d);
        System.out.println();

        int e = 7;
        e %=2;
        System.out.println(e);


    }
}
