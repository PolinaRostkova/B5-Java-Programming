package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        AudioBook ab1 = new AudioBook();
        // ab1 has 9 var | 7 from parent + 2 from itself
//        ab1.author = "Samuel Nguyen";
//        ab1.authorAge = 30;
        ab1.authorObj = new Author("Pepa Pig", 10);
        ab1.genre = "Education";
        ab1.title = "Java is King";
        ab1.chapterCount = 10;
        ab1.price = 20.99;
        ab1.hasMovie = false;
        ab1.duration = 2.5;
        ab1.narrator = "Morgan Freeman";

        // ab1 has one instance method access
        ab1.listen();

        System.out.println("----------------");
        EBook ebook1 = new EBook();
        // ebook1 has 9 instance var access: 7 from parent and 2 from itself
        ebook1.title = "Jane Eyre";
//        ebook1.authorAge = 40;
//        ebook1.author = "Charlotte Bronte";
        ebook1.genre = "Romance";
        ebook1.chapterCount = 38 ;
        ebook1.price = 8;
        ebook1.hasMovie = true;
        ebook1.size = 5;
        ebook1.pages = 200;
        ebook1.read();

        System.out.println("----------------");
        Book b = new Book();
        b.authorObj = new Author("James Bond", 60);

        System.out.println("----------------");
        Author author1 = new Author("Tom Jerry", 5);
        System.out.println(author1);
    }
}
