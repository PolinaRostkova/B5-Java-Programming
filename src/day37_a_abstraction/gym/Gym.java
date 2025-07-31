package day37_a_abstraction.gym;

public class Gym {
    public static void main(String[] args) {
        PushUps pu = new PushUps("Single handed");
        pu.doExercise();
        pu.burnCalories(10);
        System.out.println("Recovery time for push ups: " + pu.recoverTime(10));

        Running r = new Running("Marathon running ");
        r.doExercise();
        r.burnCalories(10);
        System.out.println("Recovery time for running: " + r.recoverTime(15));
    }
}
