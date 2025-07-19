package day33_a_static;

// custom class/template/blueprint of how each object of this class will behave
public class Song {
    // MEMBERS of the class

    // 1. Instance variables (members) - each object will have its own version/copy of these
    String name;
    double length;
    String singer;
    String genre;

    // 2. CONSTRUCTOR - which initializes just name

    public Song(String name){
        this.name = name; // without "this" keyword compiler prioritize local variable over instance var.
    }

    // we did constructor overloading
    // CONSTRUCTOR - which initializes name and length
    public Song(String name, double length){
        this(name); // always in the first line of the constructor
        // this.name = name;
        this.length = length;
    }

    // CONSTRUCTOR - which initializes name and length, singer, genre
    public Song(String name, double length, String singer, String genre){
        this(name, length); // always in the first line of the constructor
        this.singer = singer;
        this.genre = genre;
    }

    // is we have not declared toString method printing the obj will show only memory location
    // if we have declared it, it will show it in exact way that we built this method
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
