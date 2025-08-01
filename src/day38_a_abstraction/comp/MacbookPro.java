package day38_a_abstraction.comp;
// concrete class
public class MacbookPro implements Mac{

    @Override
    public void turnOn() {
        System.out.println("Turning on the MacBook Pro");
    }
}

class Runner{
    public static void main(String[] args) {
        // Reach static members with interface
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
        Mac.company();

        System.out.println();

        // Reaching the static members with class
        System.out.println(MacbookPro.NAME);
        System.out.println(MacbookPro.OS);
        //MacbookPro.company(); // interface static method can only be called with interface, it does not inherit

        System.out.println();
        // we cannot create an objet of interface
        MacbookPro mP = new MacbookPro();
        mP.turnOn();
        mP.faceTime();

    }
}
