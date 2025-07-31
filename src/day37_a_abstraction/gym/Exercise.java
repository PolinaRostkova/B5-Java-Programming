package day37_a_abstraction.gym;

public abstract class Exercise {
    String name;

    public Exercise(String name) {
        this.name = name;
    }

    public abstract void doExercise();

    public abstract void burnCalories(int min);

    public abstract int recoverTime(int min);
}
