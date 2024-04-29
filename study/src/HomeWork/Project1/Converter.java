package HomeWork.Project1;

public class Converter {
    private static final double ONE_STEP_CALORIES = 0.04;
    private static final double KM_COEFFICIENT = 0.0007;


    public static double convertSteps(int steps) {
        return steps * KM_COEFFICIENT;
    }

    public static double getCalories(int steps) {
        return steps * ONE_STEP_CALORIES;
    }
}
