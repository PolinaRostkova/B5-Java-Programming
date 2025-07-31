package day37_a_abstraction.gym;
// since it is a concrete class it has to implement or override all parent abstract methods
public class Running extends Exercise{
    //String name;

    public Running(String name) {
        super(name);
    }

    @Override
    public void doExercise() {
        System.out.println("Running " + name);
    }

    @Override
    public void burnCalories(int min) {
        System.out.println("In " + min + " you can burn " + min * 15 + " cals by doing " + name);
    }

    @Override
    public int recoverTime(int min) {
        return min * 20;
    }
}
