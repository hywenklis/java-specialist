package fundamentalsoflanguage;

import java.util.Scanner;

public class CalculatorIndexBodyMass {
    private static final double UNDER_WEIGHT_M = 20.7;
    private static final double UNDER_WEIGHT_F = 19.1;
    private static final double IDEAL_WEIGHT_M = 26.4;
    private static final double IDEAL_WEIGHT_F = 25.8;
    private static final double LITTLE_OVERWEIGHT_M = 27.8;
    private static final double LITTLE_OVERWEIGHT_F = 27.3;
    private static final double ABOVE_IDEAL_WEIGHT_M = 31.1;
    private static final double ABOVE_IDEAL_WEIGHT_F = 32.3;

    private static final String UNDER_WEIGHT_CATEGORY = "Abaixo do peso.";
    private static final String IDEAL_WEIGHT_CATEGORY = "No peso ideal.";
    private static final String LITTLE_OVERWEIGHT_CATEGORY = "Um pouco acima do peso ideal.";
    private static final String ABOVE_IDEAL_WEIGHT_CATEGORY = "Acima do peso ideal.";
    private static final String OBESITY_CATEGORY = "Obeso.";

    private static final String FEMALE = "F";
    private static final String MASCULINE = "M";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sexo: [F / M]");
        String sex = scanner.next().toUpperCase();

        System.out.print("Peso: ");
        int weight = scanner.nextInt();

        System.out.print("Altura: ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);
        String category = calculateIMCCategory(sex, imc);

        System.out.println(category);
        System.out.println("Fim do programa.");
    }

    private static String calculateIMCCategory(String sex, double imc) {
        if (sex.equals(MASCULINE) && imc < UNDER_WEIGHT_M || sex.equals(FEMALE) && imc < UNDER_WEIGHT_F) {
            return UNDER_WEIGHT_CATEGORY;
        } else if (sex.equals(MASCULINE) && imc > UNDER_WEIGHT_M && imc <= IDEAL_WEIGHT_M || sex.equals(FEMALE) && imc >= UNDER_WEIGHT_F && imc <= IDEAL_WEIGHT_F) {
            return IDEAL_WEIGHT_CATEGORY;
        } else if (sex.equals(MASCULINE) && imc > IDEAL_WEIGHT_M && imc <= LITTLE_OVERWEIGHT_M || sex.equals(FEMALE) && imc > IDEAL_WEIGHT_F && imc <= LITTLE_OVERWEIGHT_F) {
            return LITTLE_OVERWEIGHT_CATEGORY;
        } else if (sex.equals(MASCULINE) && imc > LITTLE_OVERWEIGHT_M && imc <= ABOVE_IDEAL_WEIGHT_M || sex.equals(FEMALE) && imc > LITTLE_OVERWEIGHT_F && imc <= ABOVE_IDEAL_WEIGHT_F) {
            return ABOVE_IDEAL_WEIGHT_CATEGORY;
        } else {
            return OBESITY_CATEGORY;
        }
    }
}
