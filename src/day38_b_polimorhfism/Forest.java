package day38_b_polimorhfism;

public class Forest {
    public static void main(String[] args) {
        // 1 - Animal class
        // 1.1 - reference is itself
        Animal animal = new Animal();
        animal.eat();
        animal.name = "General Animal";
        System.out.println(animal.name);

        System.out.println();

        // 2 - Reptile class
        // 2.1 - reference is itself
        Reptile reptile = new Reptile();
        // What this Reptile has access to
        reptile.eat();
        reptile.numOfLegs = 10;
        System.out.println(reptile.numOfLegs);
        reptile.name = "Reptile";
        System.out.println(reptile.name);

        System.out.println("*****************");

        // 2.2 - reference is parent
        Animal reptile2 = new Reptile();
        // What this Reptile2 has access to
        reptile2.eat();
        //reptile2.numOfLegs = 10;
        //System.out.println(reptile2.numOfLegs);
        reptile2.name = "Reptile";
        System.out.println(reptile2.name);

        System.out.println("===============");

        // 3 - Lizard class
        // 3.1 - itself
        Lizard l1 = new Lizard();
        l1.eat();
        l1.skinColor = "Multicolor";
        System.out.println(l1.skinColor);
        l1.numOfLegs = 12;
        System.out.println(l1.numOfLegs);
        l1.name = "Gugu";
        System.out.println(l1.name);

        System.out.println("++++++++++++++++++");

        // 3.2 - parent reference
        Reptile l2 = new Lizard();
        l2.eat();
        //l2.skinColor = "Multicolor";
        //System.out.println(l2.skinColor);
        l2.numOfLegs = 12;
        System.out.println(l2.numOfLegs);
        l2.name = "Gugu";
        System.out.println(l2.name);

        System.out.println("++++++++++++++++++");

        // 3.2 - parent reference
        Animal l3 = new Lizard();
        l3.eat();
//        l3.skinColor = "Multicolor";
//        System.out.println(l3.skinColor);
//        l3.numOfLegs = 12;
//        System.out.println(l3.numOfLegs);
        l3.name = "Gugu";
        System.out.println(l3.name);

    }
}
/*
Object can take different forms - by reference side
    What can be the reference?
        - Itself:       Reptile reptile = new Reptile();
        - Parent class  Animal reptile2 = new Reptile();
        - Interface

    Reference side makes the decision what you have access to
    Changing the reference changes the access to the members

 */