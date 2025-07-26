package day36_inheritance.final_keyword;

public class final_ex {
    /*
    can be used for variable, methods, class
     */

    // instance var - with NO final
    int a = 5;
    int b;

    final int c = 5; // since instance variable is final the value cannot be changed
    //final int d; --> should be initialized

    final int d; // since we have only one constructor and d gets assigned there this should be good

    public final_ex(int d) {
        this.d = d;
    }

    public final_ex(int a, int b, int d) {
        this(d);
        this.a = a;
        this.b = b;
    }

    //public static final --> constant variable
    // Naming rule for constant --> ALL UPPERCASE
    public static final String EARTH = "Earth";
    public static final int NUM_OF_PLANETS;

    static {
        NUM_OF_PLANETS = 9;
    }

}
