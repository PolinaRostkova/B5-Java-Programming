package day16_loops;

public class SmsParts {
    public static void main(String[] args) {
        String sms = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        //String sms = "Sender: James Bond. From Number: 202-123-3456]. + Message: I love programming and problem solving";
        // susbstring( sms.indexOf(" ") + 1, sms.indexOf(".") )
        // susbstring( sms.indexOf("Number:") + 7, sms.lastIndexOf(".") )
        // susbstring( sms.lastIndexOf(":") +2 )



        // substring(); -- > to get the portion of the String
        // substring(StartIndex);
        // substring(startIndex, EndIndex);

        // substring(); --> to get the portion of the string
        String namePart = sms.substring(sms.indexOf("<") + 1, sms.indexOf(">"));
        String numberPart = sms.substring(sms.indexOf("[") +1, sms.indexOf("]"));
        String massegePart =  sms.substring(sms.indexOf("{") +1, sms.indexOf("}"));

        System.out.println("Info: ");
        System.out.println("\tName: " + namePart);
        System.out.println("\tPhone: " + numberPart);
        System.out.println("\tMassage: " + massegePart);
    }
}
