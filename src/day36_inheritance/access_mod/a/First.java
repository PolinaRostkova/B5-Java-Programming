package day36_inheritance.access_mod.a;

public class First {
    // Instance var                     // access modifiers
    public int one = 1;                 // public
    protected int two = 2;              // protected
    int three = 3;                      // default
    private int four = 4;               // private

    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.one);          // public - same class + same package accessible
        System.out.println(first.two);          // protected - same class + same package accessible
        System.out.println(first.three);        // default - same class + same package accessible
        System.out.println(first.four);         // private - same class + same package accessible
    }
}

/*
Accessibility
                Same Class                  Same Package                    Different Package
public              YES                         YES                                 YES
private             YES                         NO                                  NO
default             YES                         YES                                 NO
protected           YES                         YES                                 NO (yes when it is inherited)
 */