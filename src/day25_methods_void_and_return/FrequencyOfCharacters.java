package day25_methods_void_and_return;

import my_util.StringUtil;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(frequencyOfChar("apple", 'p'));

        System.out.println(frequencyOfChar("apple", 'z'));

        System.out.println(StringUtil.frequencyOfChar("loopcamp", 'o'));
    }

    public static int frequencyOfChar(String word, char letter){ // order of data meters when you are passing it

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }
}
