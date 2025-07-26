package day36_inheritance.final_keyword;

public class UsingFinal {
    public static void main(String[] args) {
        final_ex finalEx = new final_ex(20);
        System.out.println("a " + finalEx.a);
        System.out.println("b " + finalEx.b);
        finalEx.a = 10;
        finalEx.b = 11;
        System.out.println("a " + finalEx.a);
        System.out.println("b " + finalEx.b);

        System.out.println();

        final_ex finalEx2 = new final_ex(20);
        System.out.println("c " + finalEx2.c);
        System.out.println("d " + finalEx2.d);

        //finalEx2.c = 20; ---> since instance variable is final the value cannot be changed

        System.out.println("--------------------");
        System.out.println(final_ex.EARTH); // value cannot be changed

    }
}
