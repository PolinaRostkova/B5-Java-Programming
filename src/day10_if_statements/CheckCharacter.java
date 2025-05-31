package day10_if_statements;

public class CheckCharacter {
    public static void main(String[] args) {
        //dataType varName:
        char letter = 'B';
        //SINGLE IF STATEMENT - if condition is TRUE if block will be executed and if it is FALSE - block will be skipped
        if (65<= letter && letter <=90){
            System.out.println("Uppercase");
        }


        if (97<= letter && letter <=122) {
            System.out.println("lowercase");
        }
    }
}
