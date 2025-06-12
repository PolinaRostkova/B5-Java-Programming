package day13_string;

public class StringImmutable {
    public static void main(String[] args) {
        String word1 = "Loop";
        String word2 = "Loop";

        System.out.println(word1);
        System.out.println(word2);

        word1 = word1 + "camp"; // "Loop" + "camp" = Loopcamp
        System.out.println("------------");
        System.out.println(word1);
        System.out.println(word2);

        String word3 = "LOOP";
        System.out.println(word3);
        word3 = word3 + "!";
        System.out.println(word3); // here we didn't change initial value we just don't have access to it anymore
        // IMMUTABLE --> ones the String object is created, it CANNOT be modified (Changed)
    }
}
