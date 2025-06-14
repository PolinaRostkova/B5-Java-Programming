package day18_loops;

public class CountChars {
    public static void main(String[] args) {

        String word = "2juMp41EEkd4s4&%$#";
        int upperCase = 0;
        int lowerCase = 0;
        int howManyNumbers = 0;
        int specialCharCount = 0;

        for (int i = 0; i < word.length(); i++) {
            //System.out.println(word.charAt(i));
            char eachChar = word.charAt(i);
            if (65 <= eachChar && eachChar<= 90  ){
                upperCase++;
            } else if (97 <= eachChar && eachChar <= 122) {
                lowerCase++;
            } else if (48 <= eachChar && eachChar <= 57) {
                howManyNumbers++;
            } else {
                specialCharCount++;
            }
        }
        System.out.println("Amount of Upper Case letters: " + upperCase);
        System.out.println("Amount of Lower Case letters: " + lowerCase);
        System.out.println("Amount of numbers: " + howManyNumbers);
        System.out.println("Amount of special characters: " + specialCharCount);
    }
}
