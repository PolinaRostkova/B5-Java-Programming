package day15_string;

public class TernaryExample {
    public static void main(String[] args) {

        // condition ? trueResult : falseResult;

        System.out.println( 5 > 3 ? "green" : 9 < 20 ? "yellow" : "brown" ); // we can say it is nested ternary

        System.out.println();

        System.out.println(6<7 ? 12>10 ? "black" : "white" : "orange");

        if (6<7){
            if (12>10){
                System.out.println("black");
            } else {
                System.out.println("white");
            }

        } else {
            System.out.println("orange");
        }
    }
}
