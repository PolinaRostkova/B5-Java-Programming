package day39_a_polymorphism.book;

import day38_b_polimorhfism.Animal;
import day39_a_polymorphism.cloth.Clothes;

public class Library {
    public static void main(String[] args) {
        // All possible references for Java Book

        JavaBook book1 = new JavaBook();
        // access to instance evar
        book1.name = "Java Programming";
        book1.storageSize = 124;
        book1.isGreatBook = true;

        // access to methods
        book1.download();
        book1.read();
        book1.open();

        System.out.println("-----------------");

        EBook book2 = new JavaBook();
        // access to instance evar
        book2.name = "Java Programming";
        book2.storageSize = 124;
        //book2.isGreatBook = true; // reference side has no  access
        // lets say in ti=his line we need to reach the "isGreatBook" one time only ---> we can CAST
        // we can quickly cast it to be able to reach this member
        JavaBook b22 = ((JavaBook)book2); // we can also assign it to our concrete class, but this way we do not limit the access
        b22.isGreatBook = true;
        // DOWN CASTING
        //((JavaBook)book2).isGreatBook = true; //  another way to cast it with no assigning so usually this way used

        // access to methods
        //book2.download(); // reference side has no  access
        book2.read();
        book2.open();
        b22.download();

        System.out.println("-----------------");
        Book book3 = new JavaBook();
        // access to instance evar
        book3.name = "Java Programming";
       // book3.storageSize = 124; // reference side has no  access
       // book3.isGreatBook = true; // reference side has no  access

        // access to methods
        //book3.download(); // reference side has no  access
        book3.read();
        //((EBook)book3).download();
        ((JavaBook)book3).download(); // in order to do casting we have to have relationship between classes. without relationship, it will throw an exception ClassCastException
        //book3.open(); // reference side has no  access

        System.out.println("-----------------");

        Downloadble book4 = new JavaBook();
        // access to instance evar
//        book4.name = "Java Programming";  // reference side has no  access
//        book4.storageSize = 124;  // reference side has no  access
//        book4.isGreatBook = true; // reference side has no  access

        // access to methods
        book4.download();
//        book4.read(); // reference side has no  access
//        book4.open(); // reference side has no  access

        System.out.println("****************************");
        System.out.println(book1 instanceof JavaBook);
        System.out.println(book1 instanceof EBook);
        System.out.println(book1 instanceof Book);
        System.out.println(book1 instanceof Downloadble);
        System.out.println();
        System.out.println(book2 instanceof JavaBook);
        System.out.println(book2 instanceof EBook);
        //System.out.println(book2 instanceof Clothes);
    }
}
