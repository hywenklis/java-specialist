package fundamentalsoflanguage.calculateIMC.strategy.impl;

import fundamentalsoflanguage.calculateIMC.strategy.IMCCategoryStrategy;

public class IdealWeightCategoryStrategyImpl implements IMCCategoryStrategy {

    private static final String IDEAL_WEIGHT_CATEGORY = "No peso ideal.";
    private final double underWeight;
    private final double idealWeight;

    public IdealWeightCategoryStrategyImpl(double underWeight, double idealWeight) {
        this.underWeight = underWeight;
        this.idealWeight = idealWeight;
    }

    @Override
    public String getCategory(double imc) {
        if (imc >= underWeight && imc <= idealWeight) {
            return IDEAL_WEIGHT_CATEGORY;
        }
        return null;
    }
}
