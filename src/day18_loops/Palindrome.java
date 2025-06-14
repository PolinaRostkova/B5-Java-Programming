package day18_loops;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Ana";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversed);

        if (word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
