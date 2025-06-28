package day24_methods;
/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw
*/

public class LastCharacters {
    public static void main(String[] args) {
        String[][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };
          /*
            Loop and get each single D array
                loop and get each elem
                    char var - > charAt(lastChar)
                print
         */


        for (String[] eachArr : words){
            String lastChars1 = "";
            for (String eachWord : eachArr){
                char lastChars = eachWord.charAt(eachWord.length()-1);
                lastChars1 += lastChars;
            }
            System.out.println(lastChars1);
        }

        System.out.println("-------------------------------------------");

        for (int i = 0; i < words.length; i++) {
            String lastChars1 = "";
            String[] eachArr = words[i];
            for (int j = 0; j < eachArr.length; j++) {
                String eachWord = eachArr[j];
                char lastChars = eachWord.charAt(eachWord.length()-1);
                lastChars1 += lastChars;
            }
            System.out.println(lastChars1);
        }

        MyFirstMethod.printHello();
    }
}
