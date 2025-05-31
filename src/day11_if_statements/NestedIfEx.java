package day11_if_statements;

public class NestedIfEx {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = true;
        boolean d = false;

        if (a){
            System.out.println(1);
            if (b){  // nested IF
                System.out.println(2);
            }
        }
// Q: how can we use it?
        /*
        if it is monday i will go out in the morning and in the night
            if i go out in the night i will put my blue jacket
            if i go out in the morning i wil put my yellow jacket

        if it is not monday i stay and home

        if (Monday) {
            if (it is morning) {
            sout ("blue jacket")
            } else if ( it is night)
            sout ("yellow jacket")
            }

        } else {
        sout ("stay at home")
       }
         */
    }
}
