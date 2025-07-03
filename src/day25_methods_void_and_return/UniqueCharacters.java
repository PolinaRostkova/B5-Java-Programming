package day25_methods_void_and_return;

public class UniqueCharacters {
    public static void main(String[] args) {

        System.out.println(uniqueChars("loopcamp"));
    }

    public static String uniqueChars(String word){
        String uniqueChars = "";
        char[] wordArr = word.toCharArray();

        for (char eachChar : wordArr){
            if (!uniqueChars.contains("" + eachChar)){
                uniqueChars += eachChar;
            }
        }
        return uniqueChars;
    }
}
