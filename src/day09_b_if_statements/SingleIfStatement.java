package day09_b_if_statements;


public class SingleIfStatement {
    public static void main(String[] args) {
        // single 'if' statement - with direct boolean value
        //Condition ---> true/false



        if (false) {
            System.out.println("1st print"); // everything is inside of the if curly brecets only works inside of them
        }
        System.out.println("2nd print");

        System.out.println("-----------------------------");
        //single statement - with rational operators with results in - true/false

        int num = 75;
        if (num>=75){ // if true - do the code block of 'if' statement, if false do nothing (skip code block)
            System.out.println("You are a senior citizen");
        }

        if (num < 75){
            System.out.println("You are not senior citizen");
        }
        System.out.println("-----------------------------");

        // single if statement with logical operators which results in true/false

        boolean isCitizen = true;
        boolean is18TearOld = num >= 18;
        //person is only eligible if he is a citizen and at least 18 years old
        if (isCitizen&&is18TearOld){
            System.out.println("You are eligible to vote");
            System.out.println("Please go to the next closest voting location to vote");
        }

        if (isCitizen){
            System.out.println("You do not need passport to enter the country");
        }

    }
}


