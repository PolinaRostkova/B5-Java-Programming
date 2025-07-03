package day25_methods_void_and_return;
/*
Names:          CreditScore
    Tom             600
    Jerry           750
    James           800
 */
public class CreditScore {
    public static void main(String[] args) {

        int creditScoreForTom = getCreditScore("Tom");
        System.out.println(creditScoreForTom);

        System.out.println("--------------------------------");


        String scoreLevelForTOm = scoreLevel(creditScoreForTom);
        System.out.println(scoreLevelForTOm);

        String creditScoreForJerry = scoreLevel(getCreditScore("Jerry"));
    }

    // write a code that returns a credit score based on your name
    public static int getCreditScore(String name){

        int creditScore = 0;
        if (name.equalsIgnoreCase("Tom")){
            creditScore = 600;
        } else if (name.equalsIgnoreCase("Jerry")) {
            creditScore = 750;
        } else if (name.equalsIgnoreCase("James")) {
            creditScore = 800;
        } else {
            System.out.println("We do not have information about that input");
            creditScore = -1;
        }

        return creditScore;
    }

    public static String scoreLevel(int scoreToCheck){
        String scoreLevel = "";
        if (scoreToCheck < 600){
            scoreLevel = "fair";
        } else if (scoreToCheck >= 600 && scoreToCheck <= 720) {
            scoreLevel = "good";
        } else if (scoreToCheck > 720 && scoreToCheck <= 850) {
            scoreLevel = "exceptional";
        } else {
            scoreLevel = "Invalid input";
        }

        return scoreLevel;
    }
}
