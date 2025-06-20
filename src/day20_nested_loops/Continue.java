package day20_nested_loops;

public class Continue {
    public static void main(String[] args) {

        //outer loop
        for (int i = 0; i < 5; i++) {

            if (i == 3){
                continue; // skips everything in outer loop when meets the condition and goes to the next
            }
            System.out.println("i: " + i);

            // inner loop
            for (int j = 0; j < 3; j++) {

                if (j == 1){
                    continue; // skips everything in inner loop after continue and goes to NEXT cycle/ of inner loop
                }
                System.out.println("j: " + j);
            }
        }
    }
}
