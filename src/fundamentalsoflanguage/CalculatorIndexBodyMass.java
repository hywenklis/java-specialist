package fundamentalsoflanguage;

import java.util.Scanner;

public class CalculatorIndexBodyMass {
    private static final double MIN_WEIGHT = 18.5;
    private static final double MAX_WEIGHT = 25;
    private static final double OVERWEIGHT_MIN = 25;
    private static final double OVERWEIGHT_MAX = 30;
    private static final double GRADE_I_OBESITY_MIN = 30;
    private static final double GRADE_I_OBESITY_MAX = 35;
    private static final double GRADE_II_OBESITY_MIN = 35;
    private static final double GRADE_II_OBESITY_MAX = 40;
    private static final String MIN_WEIGHT_CATEGORY = "Abaixo do peso ideal.";
    private static final String MAX_WEIGHT_CATEGORY = "Peso ideal.";
    private static final String OVERWEIGHT_CATEGORY = "Acima do peso.";
    private static final String GRADE_I_OBESITY_CATEGORY = "Obesidade grau I.";
    private static final String GRADE_II_OBESITY_CATEGORY = "Obesidade grau II.";
    private static final String GRADE_III_OBESITY_CATEGORY = "Obesidade grau III.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso: ");
        int weight = scanner.nextInt();

        System.out.print("Altura: ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);
        String category = calculateIMCCategory(imc);

        System.out.println(category);
        System.out.println("Fim do programa.");
    }

    private static String calculateIMCCategory(double imc) {
        if (imc < MIN_WEIGHT) {
            return MIN_WEIGHT_CATEGORY;
        }
        if (imc < MAX_WEIGHT) {
            return MAX_WEIGHT_CATEGORY;
        }
        if (imc < OVERWEIGHT_MAX) {
            return OVERWEIGHT_CATEGORY;
        }
        if (imc < GRADE_I_OBESITY_MAX) {
            return GRADE_I_OBESITY_CATEGORY;
        }
        if (imc < GRADE_II_OBESITY_MAX) {
            return GRADE_II_OBESITY_CATEGORY;
        }
        return GRADE_III_OBESITY_CATEGORY;
    }
}
