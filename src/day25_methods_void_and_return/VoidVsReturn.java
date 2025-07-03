package day25_methods_void_and_return;

public class VoidVsReturn {
    // main(); --> method where the execution starts
    public static void main(String[] args) {
        sayHi();

        System.out.println("-------");

        String str = "loopcamp";
        str.substring(0, 3);            // will return String loop
        str.length();                   // return int
        System.out.println(str);        // void --> doesn't return anything

        System.out.println("------------");

        sayHi2(); // "Hi"
        String str2 = sayHi2();
        System.out.println(str2);
        System.out.println(sayHi2());
    }
    //NOTE: there are two types of methods in terms of return type: 1) void return type   2) dataType return
    //Custom method -- sayHi() -- > it is VOID TYPE of method in terms of return --> doest only action and NOT return anything
    public static void sayHi(){
        System.out.println("Hi");
    }

    //Custom method sayHi2 --> it is return type of method in terms of return - it does the action and returns the String
    public static String sayHi2(){
        String str = "Hi";
        return str;
    }


}
