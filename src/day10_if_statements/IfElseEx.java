package day10_if_statements;

public class IfElseEx {
    public static void main(String[] args) {
        int examResult = 75;

        // if your result is more than or equal to 75, you pass. Otherwise you fail
        if (examResult>=75){
            System.out.println("Pass");
        }

        if (examResult<75){
            System.out.println("Fail");
       }
        System.out.println("-----------------");

        int score = 60;

        // if your result is more than or equal to 75, you pass. Otherwise you fail
        if (score>=75){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
