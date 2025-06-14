package day18_loops;

public class ForLoopExample {
    public static void main(String[] args) {

        // initialization ---> int i = 0;
        // condition      ---> i <= 10;
        // iteration      ---> i++

        // #1 - foe loop

        System.out.println("This is for FOR loop");
        for (int i = 0; i <= 10; i++  ){
            System.out.println(i);
        }
        /*
        Flow:
            1 - initialization
            2 - check condition
                2.a - true - execute the code block
                    3 - iteration
                    4 - repeat from 2
                2.b - false - end the loop
         */

        System.out.println("-----------------------------");

        System.out.println("This is for the WHILE loop: ");

        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
    }
}
