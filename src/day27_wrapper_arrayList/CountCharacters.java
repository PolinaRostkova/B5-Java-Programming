package day27_wrapper_arrayList;

public class CountCharacters {
    public static void main(String[] args) {

        String str = "lsvher3485VRS345tgss@#$%63SVW#$XC";
        int countUpper = 0;
        int countLower = 0;
        int countDigits = 0;
        int countSpecial = 0;

        char[] allLetters = str.toCharArray();

        for (char eachLetter : allLetters){
//            if (65 <= eachLetter && eachLetter <= 90){
//                countUpper++;
//            } else if (97 <= eachLetter && eachLetter <= 122) {
//                countLower++;
//            } else if (48 <= eachLetter && eachLetter <= 57){
//                countDigits++;
//            } else {
//                countSpecial++;
//            }

            if (Character.isUpperCase(eachLetter)){
                countUpper++;
            } else if (Character.isLowerCase(eachLetter)) {
                countLower++;
            } else if (Character.isDigit(eachLetter)){
                countDigits++;
            } else {
                countSpecial++;
            }
        }

        System.out.println("Uppercase letter count: " + countUpper);
        System.out.println("Lowercase letter count: " + countLower);
        System.out.println("Digit letter count: " + countDigits);
        System.out.println("Special letter count: " + countSpecial);


    }
}
