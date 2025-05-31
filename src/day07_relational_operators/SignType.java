package day07_relational_operators;

public class SignType {
    public static void main(String[] args) {
        int num = 98;

        boolean isPositive = num > 0 ;
        boolean isNegative = num < 0;
        boolean isZero = num == 0 ;

        System.out.println("Num is positive: "+isPositive);
        System.out.println("Num is negative: "+isNegative);
        System.out.println("Num is zero: "+ isZero);

    }
}
