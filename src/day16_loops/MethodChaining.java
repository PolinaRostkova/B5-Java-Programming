package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {
        String sentence = "Today is Wednesday. Wednesday is a fund day.";
        System.out.println(sentence);

        // METHOD CHAINING: combining multiple methods together.
        //rule: you can combine methods together AS LONG AS method returns String

        sentence = sentence.substring( sentence.indexOf(".") + 2, sentence.lastIndexOf(" is")).toUpperCase();
        System.out.println(sentence);
    }
}
