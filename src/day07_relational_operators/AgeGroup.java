package day07_relational_operators;

public class AgeGroup {
    public static void main(String[] args) {
        int ageOfPerson = 0;
        boolean isKid = ageOfPerson <= 13;
        System.out.println("Is it a kid: "+ isKid);

        boolean isSenior = ageOfPerson >= 65;
        System.out.println("Is it a senior: "+ isSenior);

    }
}
