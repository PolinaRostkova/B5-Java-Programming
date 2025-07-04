package day26_methods;
//Runner class
public class Draw {
    public static void main(String[] args) {
        Picture.draw("Yellow");
        Picture.draw();

        Picture.draw("Red", "Blue");

        Picture.draw(5);

        Picture.draw("Pink", 5);
    }
}
