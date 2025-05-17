package day06_a_arithmetic_operators;

public class CastingEx {
    public static void main(String[] args) {
        int num1 = 40;
        float num2 = num1;
        System.out.println(num1);
        System.out.println(num2);


        float num3 = 50.5f;
        short num4 = (short) num3;
        System.out.println(num3); //50.5
        System.out.println(num4); //50 ---> still data loss happens and number appeared as short but not deciamal
        System.out.println();

        char letter1 = 'f';
        int letterInt = letter1; //we can assign char to int because in ASCII table 'f' has number behind it like every other char
        System.out.println(letter1);
        System.out.println(letterInt);


    }
}
