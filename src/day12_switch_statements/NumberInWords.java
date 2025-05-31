package day12_switch_statements;

public class NumberInWords {
    public static void main(String[] args) {
        int num = 9;

        if (num == 0){
            System.out.println("Zero");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num==3) {
            System.out.println("Three");
        } else if (num==4) {
            System.out.println("Fore");
        } else if (num==5) {
            System.out.println("FIve");
        } else if (num==6) {
            System.out.println("Six");
        } else if (num==7) {
            System.out.println("Seven");
        } else if (num==8) {
            System.out.println("Eight");
        } else if (num==9) {
            System.out.println("Nine");
        }
        System.out.println("---------------------------");
        // Option 2 - SWITCH - control flow statement
        /*
        RULES:
        Rule 1 - the exactValue cannot be DUPLICATE / cases cannot be duplicate
        Rule 2 - For switch canNOT compare with relation operators ( >, < >=, <=)
        Rule 3 - Works only with String, char, short, int, byte
        Rule 4 - after 1st matching case execution goes until the 1st break
         */
        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default: // like else part
                System.out.println("Covers everything else");
        }
    }
}
