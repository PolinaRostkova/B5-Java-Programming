package day39_a_polymorphism.poly_array;

import java.sql.Array;
import java.util.Arrays;

class A{
    @Override
    public String toString() {return "A";}
}

class B1 extends A{
    @Override
    public String toString() {return "B1";}
}

class B2 extends A{
    @Override
    public String toString() {return "B2";}
}

class C1 extends B1{
    @Override
    public String toString() {return "C1";}
}

class D{
    public String toString() {return "D";}
}
public class PolumorphicArray {
    public static void main(String[] args) {
        // Array: fixed size, stores same data type, works with primitive and primitive data type (object type)

        String s2 = "d";

        String[] str1 = {"a", "b", "c"};
        String[] str2 = {new String("a"), new String("b"), new String("c"), s2};
        int[] num1 = {1,2,3,4};
        Integer[] num2 = {1,2,3,4,5};

        D d1 = new D();
        D d2 = new D();
        D d3 = new D();

        D[] arr1 = {d1, d2, d3, new D()};   // created array of D class which holds objects of D class (same data type)

        D[] arr2 = new D[4];                // created array og D class which WILL hold 4 objects of D class, now it just this --> {null, null, null, null};


        // Polymorphic Array: it can hold or store any object of itself and child classes
        A[] objArrays = new A[4];           // created array og A class which WILL hold 4 objects of A class, now it just this --> {null, null, null, null}
       objArrays[0] = new A();              // {new A();, null, null, null}

        System.out.println(Arrays.toString(objArrays));

       objArrays[1] = new B1();
       objArrays[2] = new B2();
       objArrays[3] = new C1();

        System.out.println(Arrays.toString(objArrays));

        //objArrays[3] = new D(); // D - does not have any relationship with A class

        System.out.println("------------------------------");

        B1[] objArr2 = new B1[4];
        objArr2[0] = (B1)new A();   // A is parent so bigger than B1 child --> then we down cast it
        objArr2[1] = new B1();  //
        //objArr2[2] = new B2();   // B@ is sibling so they are same than B1 child
        objArr2[3] = new C1();
        //objArrays[3] = new D();  // D does not have any relationship with A class so we cannot store it

    }
}

