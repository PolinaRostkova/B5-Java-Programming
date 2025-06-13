package day17_loops;

public class DoWhileEx {
    public static void main(String[] args) {
        //WHILE LOOP

        int m = 1;

        while (m <= 0){
            System.out.println("While loop " + m);
            m++;
        }

        //flow --> 1st check condition --> then execute code block if condition is true

        System.out.println("---------------------------");

        //DO WHILE LOOP
        int n = 1;
         do { // code in the DO body will be executed at least one time
             System.out.println("DO WHILE loop " + n);
             n++;
         } while (n <=0);

         // flow --> 1st execute code block of DO ---> check condition
    }
}
