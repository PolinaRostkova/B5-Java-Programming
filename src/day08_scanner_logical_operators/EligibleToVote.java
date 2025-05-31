package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        int age = 30;

        boolean is18orOlder = age >= 18;
        boolean isEligible = is18orOlder && isCitizen && !hasCriminalBackground;

        System.out.println(name + " is eligible to vote: "+ isEligible);

        System.out.println("-----------------------");

        name = "Winnie Pooh";
        isCitizen = false;
        hasCriminalBackground = false;
        age = 20;
        isEligible = is18orOlder && isCitizen && !hasCriminalBackground;
        //              true     &&  false    &&  !false(true)
        System.out.println(name + " is eligible to vote: "+ isEligible);

        System.out.println("-----------------------");

        name = "James Bond";
        isCitizen = true;
        hasCriminalBackground = false;
        age = 10;
        isEligible = is18orOlder && isCitizen && !hasCriminalBackground;
        //              true     &&  false    &&  !false(true)
        System.out.println(name + " is eligible to vote: "+ isEligible);



    }
}
