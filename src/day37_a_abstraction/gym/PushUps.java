package day37_a_abstraction.gym;

public class PushUps extends Exercise{

    //String name;

    public PushUps(String name) {
        super(name);
    }

    // since it is a concrete class it has to implement or override all parent abstract methods
    @Override
    public void doExercise() {
        System.out.println("Doing" + name + " push ups");
    }

    @Override
    public void burnCalories(int min) {
        System.out.println("In " + min + " you can burn " + min * 10 + " cals by doing " + name + " Push ups");
    }

    @Override
    public int recoverTime(int min) {
        return min * 10;
    }
}
