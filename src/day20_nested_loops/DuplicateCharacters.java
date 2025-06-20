package day20_nested_loops;

import javax.swing.plaf.IconUIResource;

/*
String --> apple

Output = p
find duplicate characters (the character that is in the word more than 1 time)
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String word = "apple";
        String single = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char outLetter = word.charAt(i);


            if (single.contains(outLetter + "")){
                continue;
            }
            for (int j = 0; j < word.length(); j++) {
                char innerLetter = word.charAt(j);

                if (outLetter == innerLetter){
                    count++;
                }

            }
            if (count == 1){
                System.out.println(outLetter);
            }

            if (!single.contains(outLetter + "")){
                single += outLetter;
            }

        }


    }
}

//todo: find the unique characters and print