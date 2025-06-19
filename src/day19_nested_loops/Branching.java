package day19_nested_loops;

public class Branching {
    public static void main(String[] args) {
        //break; --> in the loop, once execution reaches the break; statement it immediatelly STOPS the LOOP
        //continue; -->

        System.out.println("This is traditional For Loop / fori loop without break and continue");

        for (int i = 1; i <10 ; i++) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("This is traditional For Loop / fori loop with BREAK");
        for (int i = 1; i <10 ; i++) {
            System.out.println(i + " ");
            break;
        }

        for (int i = 1; i <10 ; i++) {
            System.out.println(i + " ");
            if (i == 5){
                break;
            }
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("This is traditional For Loop / fori loop with CONTINUE");
        for (int i = 1; i <10 ; i++) {
            System.out.println(i + " ");
            continue;
            //System.out.println("Hi"); not reachible
        }

        for (int i = 1; i <10 ; i++) {
            System.out.println(i + " ");

            if (i == 5){
                continue;
            }
            System.out.println("Hi");

        }

        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                continue;
            }

            System.out.println(i);
        }

    }
}
