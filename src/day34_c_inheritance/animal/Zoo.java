package day34_c_inheritance.animal;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.type = "Husky";
        dog1.numOfLegs = 4;
        //dog1.age = 6;
        dog1.bark();
        dog1.walk();

        System.out.println("-----------------");

        Cat cat1 = new Cat();
        cat1.type = "Sphynx";
        cat1.numOfLegs = 4;
       //cat1.age = 3;
        cat1.meow();
        cat1.walk();

        System.out.println("-----------------");

        Animal animal1 = new Animal();
        animal1.type = "General Animal";
        animal1.numOfLegs = 4;
        //animal1.age = 0;

    }
}
