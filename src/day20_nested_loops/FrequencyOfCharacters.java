package day20_nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String word = "apple";

        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            int counter = 0;
            char outerEachLetter = word.charAt(i);
            //String outerEachLetter = "" + word.charAt(i);

            if (unique.contains("" + outerEachLetter)){
                continue;
            }
            for (int j = 0; j < word.length(); j++) {               // apple
                char innerEachLetter = word.charAt(j);

                if (outerEachLetter == innerEachLetter){
                    counter++;
                }
            }

            System.out.println(outerEachLetter + " - " + counter);

            if (!unique.contains("" + outerEachLetter))
            unique += outerEachLetter;
        }
    }
}
