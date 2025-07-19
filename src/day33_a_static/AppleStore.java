package day33_a_static;

public class AppleStore {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Iphone 16 Pro", 1099.00);
        System.out.println(iphone1);


        Iphone iphone2 = new Iphone("Iphone 16 ProMAX", 1299.00);
        System.out.println(iphone2);


        System.out.println();
        System.out.println(iphone1.brand);
        System.out.println(iphone1.operatingSystem);
        System.out.println(iphone1.appleDay);

        System.out.println();
        System.out.println(iphone2.brand);
        System.out.println(iphone2.operatingSystem);
        System.out.println(iphone2.appleDay);


        System.out.println("----------------");
        iphone1.brand = "Apple INC";
        iphone2.operatingSystem = "IOS";

        System.out.println();
        System.out.println(iphone1.brand);
        System.out.println(iphone1.operatingSystem);
        System.out.println(iphone1.appleDay);

        System.out.println();
        System.out.println(iphone2.brand);
        System.out.println(iphone2.operatingSystem);
        System.out.println(iphone2.appleDay);


        System.out.println();
        System.out.println("----------------");
        System.out.println(Iphone.brand);
        System.out.println(Iphone.operatingSystem);
        System.out.println(Iphone.appleDay);
    }
}
