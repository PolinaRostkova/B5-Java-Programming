package day24_methods;

import day02_print_statements.HelloWorld;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name = "Tom";
        System.out.println("Hello " + name + "!");

        //do the same thing for james
        name = "James";
        System.out.println("Hello " + name + "!");

        //do the same thing for james
        name = "Winnie";
        System.out.println("Hello " + name + "!");

        System.out.println("---------------------------------");

        sayHelloTo();

        System.out.println("---------------------------------");

        //sayHelloTo2(); this method requires String data
        sayHelloTo2("Tom");
        sayHelloTo2("James");
        sayHelloTo2("loopcamp");
        sayHelloTo2("dfergerg");

        System.out.println("----------------------------------------");
        Scanner key = new Scanner(System.in);
        System.out.print("What is your name: ");
        String userName = key.next(); // TOM
        sayHelloTo2(userName);



    }

    //public, static, void, non-parametrized
    public static void sayHelloTo(){
        System.out.println("Hello " + "Tom" + "!");
    }

    //public, static, void, parametrized (1 parameter/1 argument
    //This method accepts one parameter of String Data Type
    public static void sayHelloTo2(String name){
        name = ("" +name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase(); // format: first letter upper + rest lower
        System.out.println("Hello " + name + "!");
    }
}
