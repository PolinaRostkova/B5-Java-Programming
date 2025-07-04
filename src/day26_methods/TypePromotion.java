package day26_methods;

public class TypePromotion {

    public static void main(String[] args) {
        /*
        TYPE PROMOTION
            - when calling a method with parameters it first tries to find exact matching data type
            - if not it will call next matching one
         */
         // whole numbers by default is int dataType

        byte b = 10;
        use(b);

        short s = 20;
        use(s);
    }
    public static void use (byte b){
        System.out.println("printing byte");
    }

    public static void use (short b){
        System.out.println("printing short");
    }

}
