package day38_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {

        French french = new French();
        french.sayHi();
        french.sayBye();

        System.out.println();

        Spanish spanish = new Spanish();
        spanish.sayHi();
        spanish.sayBye();
    }
}
