package day08_scanner_logical_operators;

public class ShortCircuitLogicalOperators {
    public static void main(String[] args) {
        // Difference between (short circuit) &&, || vs &, |

        int i = 10;

        // && ---> true = only if both sides are true && true
        System.out.println(false && ++i > 5);
        //
        System.out.println(i);
        System.out.println();
        int j = 10;
        System.out.println(false & ++j > 5);
        System.out.println(j);

    }
}
