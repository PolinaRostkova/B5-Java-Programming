package day06_b_unary_operators;

public class UnaryEx {
    public static void main(String[] args) {
        //int y = +5; we all know that if a value does not have + , it also means it is a positive number
        int y = 5;
        System.out.println(y); //5

        y = -y; //re-assigned y to its previous value by making it negative
        System.out.println(y); // -5
        y = -20;

        y = +y;
        System.out.println(y); // 20

        y = -y;
        System.out.println(y);
        System.out.println("------------------------");

        // INCREMENTING
        int x =0;
        System.out.println(x);
        x = x+1; // Increment x by adding 1 to its previous value
        System.out.println(x);

        x = x+1;
        System.out.println(x);


        x++; // x = x+1 ---> it is the same, we used ++ as POST INCREMENT
        System.out.println(x);

        ++x; // x = x+1 ----> also the same thing, but because pluses in front of x we call it PRE increment
        System.out.println(x);
        // Q: what is the difference between PRE increment and POST increment??
        System.out.println("--------------------");
        //DECREMENT
        int i = 10;
        System.out.println(i);

        i = i-1; // i = 10 - 1 = 9
        System.out.println(i);

        // POST decrement
        i--;
        System.out.println(i);

        //PRE decrement
        --i;
        System.out.println(i);

        //Q: then what is the difference between PRE decrement and POST decrement???

        //A: up until here (lina 54) we used ACTION of INCREMENT in one line and USED it in another line in println statement
        // but sometimes we need to do the 2 actions in ONE statement (println)
        System.out.println("-----------------------");
        int z = 10;
        //System.out.println(z = z-1); // re-assigned and printed out updated the value of z and used
        //System.out.println(z);
        z =10;
        // z--;
        System.out.println(z--); // 2 actions: 1. USE it first, 2. update it (POST)
        System.out.println(z);

        //--z;   //so which one will i do
       z =10;
        System.out.println(--z); // 2 actions: 1. update first(PRE), 2. use it

    }
}
