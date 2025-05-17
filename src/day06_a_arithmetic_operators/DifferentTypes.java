package day06_a_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {

        System.out.println(10-5); // int - int ----> int
        System.out.println(10 * 5); // int * int ---> int


        System.out.println(10.0 * 5); // double * int ---> double
        System.out.println(10.0 / 5.0); //double / double ---> double

        System.out.println(10 / 5.0); //int / double ---> double

        System.out.println((int)10.0 / 5.0); // we converted it here | double > int /double ---> double
        System.out.println((int)10.5 / (int)5.0); // double > int --- double > int /int ---> int | so we lost data .5
    }
}
