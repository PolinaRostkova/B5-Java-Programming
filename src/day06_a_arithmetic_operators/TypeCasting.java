package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 40;
        int i =b;  //implicit casting / widening casting - automatically happens. int is bo\egger so it can hold byte inside
        System.out.println(b);
        System.out.println(i);
        System.out.println();
        int i2 =100;
        //byte b2 = i2; ----> we cannot assign IMPLICITLY/AUTOMATICALLY
        byte b2 = (byte)i2;  //EXPLICIT CASTING / NARROWING CASTING - converting int into byte, only manually | int>byte
        System.out.println(i2);
        System.out.println(b2);
        System.out.println();

        int i3 =150;
        byte b3 = (byte) i3;
        System.out.println(i3);
        System.out.println(b3); //since i3 is holding the data for value which is out of the range that b3 can hold there is data loss happens

        System.out.println("-----------------------");

        int i4 = 500;
        long l4 = i4; //it is okay because int is smaller than long // implicit casting - automatically: converting int onto long
        System.out.println(i4);
        System.out.println(l4);
        System.out.println();

        long l5 =500;
        int i5 = (int)l5; //explicit casting
        System.out.println(l5);
        System.out.println(i5);
        System.out.println("------------------------");
        int i6 =50;
        double d6 = i6;  //implicit casting
        System.out.println(i6);
        System.out.println(d6);
        System.out.println();

        double d7 = 50.97;
        //int i7 = d7;
        int i7 = (int)d7; //explicit casting
        System.out.println(d7);
        System.out.println(i7);



    }
}
