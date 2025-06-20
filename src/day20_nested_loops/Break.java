package day20_nested_loops;

public class Break {
    public static void main(String[] args) {

        //outer loop
        for (int i = 0; i < 5; i++) {

            System.out.println("i: " + i);

            if (i == 3) {
                break; // since it is in outer loop it ends the whole outer loop and inner is not reachable
            }

            // inner loop
            for (int j = 0; j < 3; j++) {

                System.out.println("j: " + j);
                break; // since it is in inner loop it affects only inner loop
            }

            int k = 5;
            for (int p = 0; p < k; p++) {
                break;
            }
            System.out.println("END");
        }
    }
}