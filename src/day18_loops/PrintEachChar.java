package day18_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "loopcamp";

        // for loop is also called fori loop -or- traditional for loop
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

        //Q: how to get each character starting from end

        for (int i = str.length() - 1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }
        //Q: can you reverse the String

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
