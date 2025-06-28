package day24_methods;

public class MyMath {
    public static void main(String[] args) {
        addition(10, 6);
        addition(44, 30);

        System.out.println("--------------------");

        substruct(10, 13);
        substruct(21, 10);

        System.out.println("--------------------");

        multiply(6,7);
        multiply(21, 33);

        System.out.println("--------------------");

        division(5,2);
        division(8,5);
        division(5,0);

        System.out.println("--------------------");
        allArithmeticResults(44, 87);
    }

    public static void addition(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }

    public static void substruct (int num1, int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    }

    public static void multiply(int num1, int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    }

    public static void division (int num1, int num2){
        if (num2 == 0){
            System.out.println("Not divisible");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }

    public static void allArithmeticResults(int num1, int num2){
        addition(num1, num2);
        substruct(num1,num2);
        multiply(num1,num2);
        division(num1,num2);
    }
}
