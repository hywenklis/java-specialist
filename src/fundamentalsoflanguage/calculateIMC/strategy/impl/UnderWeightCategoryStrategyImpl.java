package fundamentalsoflanguage.calculateIMC.strategy.impl;

import fundamentalsoflanguage.calculateIMC.strategy.IMCCategoryStrategy;

public class UnderWeightCategoryStrategyImpl implements IMCCategoryStrategy {

    private static final String UNDER_WEIGHT_CATEGORY = "Abaixo do peso.";

    private final double underWeight;

    public UnderWeightCategoryStrategyImpl(double underWeight) {
        this.underWeight = underWeight;
    }

    @Override
    public String getCategory(double imc) {
        if (imc < underWeight) {
            return UNDER_WEIGHT_CATEGORY;
        }
        return null;
    }
}
