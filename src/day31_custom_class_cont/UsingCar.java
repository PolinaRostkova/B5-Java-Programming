package day31_custom_class_cont;

public class UsingCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1);

        car1.model = "Kia";
        car1.year = 2023;
        car1.color = "White";
        car1.fuelLevel = 50.0;

        System.out.println("------------------------");
        System.out.println(car1);

        System.out.println("------------------------");

        car1.drive();

        System.out.println("------------------------");
        System.out.println(car1.fuelLevel); // 50.0
        car1.fillTank(); //
        System.out.println(car1.fuelLevel);
        System.out.println("------------------------");

        System.out.println(car1.isLow());
        System.out.println("------------------------");

        Car car3 = new Car();
        car3.fuelLevel = 10;
        System.out.println(car3);
    }
}
