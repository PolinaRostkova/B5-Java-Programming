package day18_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 3;

        System.out.println(num + " x " + 1 + " = " + num * 1);

        System.out.println("-------------------");

        for (int i = 1; i <= 10; i++ ){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
