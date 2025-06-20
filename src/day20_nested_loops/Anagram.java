package day20_nested_loops;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if (word1.length() != word2.length()){
            System.out.println("Not Anagram");
        } else {
            // word1 = listen --> l      | i        | s         |t      |e      |n
            // word2 = silent --> sient  | sent     | ent       |en     |n      |-empty-
            for (int i = 0; i < word1.length(); i++) {

               String eachCharWord1 = "" + word1.charAt(i);

              word2 =  word2.replaceFirst(eachCharWord1, "");
            }
            if (word2.isEmpty()){
                System.out.println("It is Anagram");
            } else {
                System.out.println("It is not Anagram");
            }

        }
    }
}
