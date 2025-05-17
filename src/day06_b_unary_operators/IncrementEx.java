package day06_b_unary_operators;

public class IncrementEx {
    public static void main(String[] args) {
        int age = 30;
        System.out.println(age);  // we will see 30

        System.out.println(age++); //POST increment
        // 1. use it (print)
        // 2. update > age = age +1
        System.out.println(age);
        System.out.println(age++);
        System.out.println(age);

        System.out.println();
        System.out.println(--age); // PRE
        // update (33) > use (33)

        System.out.println(age--); // POST
        // use > update

        System.out.println(age);
    }
}
