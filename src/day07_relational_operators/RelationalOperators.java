package day07_relational_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // 5 > 2 ----> correct / true / right
        // 2 > 5 ----> incorrect / false / wrong
        System.out.println(5 > 2);  //Hardcoded
        System.out.println(2 > 5);
        System.out.println();

        int a = 5;
        int b = 2;
        System.out.println(a > b); // dynamic code --> using variables
        System.out.println(b > a);
        System.out.println();

        boolean is5BiggerThan2 = 5 > 2;
        boolean is2BiggerThan5 = 2 > 5;
        System.out.println(is5BiggerThan2);
        System.out.println(is2BiggerThan5);
        System.out.println();

        boolean result1 = a > b;
        boolean result2 = b > a;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println();

        System.out.println(5 >= 5);
        System.out.println();

        int j = 30;
        int i = 45;

        System.out.println(i < j);
        System.out.println(j <= i);
        System.out.println();

        System.out.println(4 == 4);
        System.out.println(4 == 5);

        // ! ---> not operator
        System.out.println(4 != 4);


    }

}
