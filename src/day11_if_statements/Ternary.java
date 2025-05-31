package day11_if_statements;

public class Ternary {
    public static void main(String[] args) {
        int a = 70;
        String result;


        // we did it with regular if statement
        if (a % 2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }
        System.out.println(result);
        System.out.println("-------------");
        // OPTION 2 with ternary
        //                  (condition)? trueValue : falseValue
        String result2 = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(result2);

        /*
        RULES:
         - when u assign the result of the TERNARY to variable, data type of the values has to be SAME and match to the variable DATA TYPE
         - when you use the result of the TERNARY in print statement, the DATA TYPE of the values does NOT have to be SAME because we are not assigning it to any data type
         */
    }
}
