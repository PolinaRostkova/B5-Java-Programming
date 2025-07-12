package day30_b_custom_classes;

public class UsingApp {
    // runner class
    public static void main(String[] args) {

        // to be able to reach we need to create object reference and new object
        App app1 = new App();
        // app1 has it is own copy of instance variables and its own instance method

        App app2 = new App(); // created another app object
        // these will show default values as we have not given any values
        System.out.println(app1.name);
        System.out.println(app1.version);
        System.out.println(app1.isFree);
        System.out.println(app1.reviews);


        System.out.println("---------------------");
        System.out.println(app2.name);
        System.out.println(app2.version);
        System.out.println(app2.isFree);
        System.out.println(app2.reviews);

        app1.run();
        app2.run();
        System.out.println("---------------------");
        app1.name = "Instagram";
        app2.name = "YouTube";

        app1.run();
        app2.run();

        System.out.println("---------------------");
        System.out.println(app1.version);
        System.out.println(app2.version);

        System.out.println("---------------------");
        app1.update();
        app2.update();

        System.out.println("---------------------");
        System.out.println(app1.version);
        System.out.println(app2.version);

        System.out.println("---------------------");
        app2.update();

        System.out.println("---------------------");
        System.out.println(app1.version);
        System.out.println(app2.version);




    }
}
