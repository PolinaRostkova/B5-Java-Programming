package day31_custom_class_cont;

public class UsingCarpet {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(4.5, 10, 9 );

        System.out.println(carpet1);
        //carpet1.calculateTotalPrice();

        System.out.println(carpet1.totalPrice);

        System.out.println(carpet1);
    }
}
