package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // LOGICAL OPERATORS
        // - for determining the range
        // - getting result for two or more different things with either TRUE or FALSE result

        int n = 25;
        //AND operator

        // Math: 5 < n < 20
        //System.out.println(5 < n < 20); // NOT VALID
        System.out.println(5 < n);
        System.out.println(n < 20);

        // Java: we cannot do this way. we use logical operators
        System.out.println(5 < n && n < 20); // works only with boolean values

        // find if number is between 1 and 10; ---> 1<n<10; --> 1 < n && n < 10
        System.out.println("--------------------");
        System.out.println(6 > 1 && true);
        //      true && true ---> true
        System.out.println(6 < 1 && true);
        //      false && true ---> false
        System.out.println(6 > 1 && false);
        //      true && false --> false

        System.out.println("---------------------");
        //OR operator
        System.out.println(3 > 2 || true);
        //      true || true ---> true

        System.out.println(3 < 2 || true);
        //      false || true ---> true

        System.out.println(3 > 2 || false);
        //      true || false ---> true

        System.out.println(3<2||false);
        //      false || false ---> false

        System.out.println("-----------------------");
        System.out.println(true); // true
        System.out.println(!true); // not true --> false
        System.out.println(false);
        System.out.println(!false);

        System.out.println(6 != 6);
        System.out.println(!(6 != 7)); // !(false)---> true


    }
}
