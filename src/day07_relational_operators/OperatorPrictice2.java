package day07_relational_operators;

public class OperatorPrictice2 {
    public static void main(String[] args) {
        int t = 100;

        int p = t++; //assign(use) + update
        //1. update: t = t + 1; t=101
        //2. assign (use): p = 101

        System.out.println(t);
        System.out.println(p);
    }
}
