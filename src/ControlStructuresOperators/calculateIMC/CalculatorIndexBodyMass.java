package ControlStructuresOperators.calculateIMC;

import ControlStructuresOperators.calculateIMC.strategy.IMCCategoryStrategy;
import ControlStructuresOperators.calculateIMC.strategy.impl.*;

import java.util.Scanner;

import static ControlStructuresOperators.calculateIMC.utils.GenreCategory.IMC_WEIGHT_MAP;

public class CalculatorIndexBodyMass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gênero: [F / M]");
        String genre = scanner.next().toUpperCase();

        double underWeight = IMC_WEIGHT_MAP.get(genre + "_UNDER_WEIGHT");
        double idealWeight = IMC_WEIGHT_MAP.get(genre + "_IDEAL_WEIGHT");
        double littleOverWeight = IMC_WEIGHT_MAP.get(genre + "_LITTLE_OVERWEIGHT");
        double aboveIdealWeight = IMC_WEIGHT_MAP.get(genre + "_ABOVE_IDEAL_WEIGHT");

        System.out.print("Peso: ");
        int weight = scanner.nextInt();

        System.out.print("Altura: ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);

        IMCCategoryStrategy[] strategies = {
                new UnderWeightCategoryStrategyImpl(underWeight),
                new IdealWeightCategoryStrategyImpl(underWeight, idealWeight),
                new LittleOverWeightCategoryStrategyImpl(idealWeight, littleOverWeight),
                new AboveIdealWeightCategoryStrategyImpl(littleOverWeight, aboveIdealWeight),
                new ObesityCategoryStrategyImpl(aboveIdealWeight)
        };

        for (IMCCategoryStrategy strategy : strategies) {
            String category = strategy.getCategory(imc);
            if (category != null) {
                System.out.println(category);
                break;
            }
        }

        System.out.println("Fim do programa.");
    }
}
