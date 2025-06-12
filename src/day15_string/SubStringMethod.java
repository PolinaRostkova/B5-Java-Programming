package day15_string;

public class SubStringMethod {
    public static void main(String[] args) {
        String day = "Saturday";
//                    01234567
        //#15 - "".substring(); --> takes the portion of the string and returns String
        System.out.println(day.substring(0)); //give me the portion starting from index 0 until end
        System.out.println(day.substring(1)); //give me the portion starting from index 1 until end
        System.out.println(day.substring(2)); //give me the portion starting from index 2 until end

        System.out.println("Sat" + day.substring(3)); //"Sat" + "urday"

        System.out.println("----------------");

        System.out.println(day.substring(0,0)); //give me the portion starting from index 0 until 0 --> ""
        System.out.println(day.substring(0,1)); //give me the portion starting from index 0 until 1 --> "S"
        System.out.println(day.substring(0,2));
        System.out.println(day.substring(0,3));
        System.out.println(day.substring(0,4));

        System.out.println();
        System.out.println(day.substring(5,7));
        System.out.println(day.substring(5,8));
    }
}
