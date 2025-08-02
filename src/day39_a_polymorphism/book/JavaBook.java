package day39_a_polymorphism.book;
// concrete class
public class JavaBook extends EBook implements Downloadble{

    boolean isGreatBook;
    @Override
    public void download() {
        System.out.println("Downloading Java Book");
    }

    @Override
    public void open() {
        System.out.println("Opening Java Book");
    }

    @Override
    public void read() {
        System.out.println("Reading Java Book");
    }
}
