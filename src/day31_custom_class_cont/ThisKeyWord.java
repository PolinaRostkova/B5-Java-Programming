package day31_custom_class_cont;

public class ThisKeyWord {
    //Instance variable
    int a;

    //                  Local variable
    public ThisKeyWord( int a){
        // In java, local variables always have the priority
        this.a = a; // instance var
        // Taking local var 'a' and re-assigning it back to local var 'a'
        // when we have local variables and instance var sharing same exact name, we can make the difference between them with the help of 'this.' key word
    }
}
