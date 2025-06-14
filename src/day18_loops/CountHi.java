package day18_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "dfvojoigjwpejhisdofvhsohispdijhislvhifdidi";
        int hiHowMany = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            String every2CHar = "" + str.charAt(i)+str.charAt(i+1);

            if (every2CHar.equalsIgnoreCase("hi")){
                hiHowMany++;
            }

        }
        System.out.println("You have " + hiHowMany + " hi in your String ");
    }
}
