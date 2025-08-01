package day38_a_abstraction.language;

public interface Language {
    // public static final ( should be initialized)
    String TOPIC = "Language";

    //public abstract void sayHi();
    void sayHi();
    void sayBye();

}

/*
    all variables are public static final
    only public access modifier is allowed
    methods with no body is public abstract by default
    we can have static method and default method as well with body
        -- since we can have static var we can use them in this method
        -- defaults can be called with a child class objects
     */