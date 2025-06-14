package day18_loops;

public class CharactersInString {
    public static void main(String[] args) {
        String word = "java";

        for (int i = 0; i < word.length(); i++) {
            System.out.println((int) word.charAt(i));
            //System.out.println(0+ word.charAt(i));
        }
    }
}
