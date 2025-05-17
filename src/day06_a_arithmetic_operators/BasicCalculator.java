package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1 = 7; //double>int | implicit casting --->7.0
        double num2 = 5; //-----> 5.0

        double additionResult = num1+num2;
        double substractionResult = num1-num2;
        double multiplicationResults = num1*num2;
        double divisionResult = num1/num2;
        double remainderResult = num1%num2; //% --> modules operator

        System.out.println(num1 + " + "+num2+" = "+additionResult);
        System.out.println(num1 + " - "+num2+" = "+substractionResult);
        System.out.println(num1 + " * "+num2+" = "+multiplicationResults);
        System.out.println(num1 + " / "+num2+" = "+divisionResult);

        System.out.println(num1 + " % "+num2+" = "+remainderResult);

        System.out.println("---------------------------------------");
        int num3 = 7;
        int num4 = 5;

        int additionResult1 = num3+num4;
        int substractionResult1 = num3-num4;
        int multiplicationResult1 = num3*num4;
        int divisionResult1 = num3/num4;
        int moduleResult1 = num3%num4;

        System.out.println(num3+" + "+num4+" = "+additionResult1);
        System.out.println(num3+" - "+num4+" = "+substractionResult1);
        System.out.println(num3+" % "+num4+" = "+moduleResult1);
        System.out.println(num3+" * "+num4+" = "+multiplicationResult1);
        System.out.println(num3+" / "+num4+" = "+divisionResult1);

        System.out.println("------------------------------------------");
        System.out.println(3.1+1); //double+int --->CASTING wil always take the bigger data type ---> 4.2






    }
}
