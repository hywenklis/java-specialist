package controlstructuresoperators.calculateIMC.strategy.impl;

import controlstructuresoperators.calculateIMC.strategy.IMCCategoryStrategy;

public class LittleOverWeightCategoryStrategyImpl implements IMCCategoryStrategy {

    private static final String LITTLE_OVERWEIGHT_CATEGORY = "Um pouco acima do peso ideal.";
    private final double idealWeight;
    private final double littleOverWeight;

    public LittleOverWeightCategoryStrategyImpl(double idealWeight, double littleOverWeight) {
        this.idealWeight = idealWeight;
        this.littleOverWeight = littleOverWeight;
    }

    @Override
    public String getCategory(double imc) {
        if (imc > idealWeight && imc <= littleOverWeight) {
            return LITTLE_OVERWEIGHT_CATEGORY;
        }
        return null;
    }
}
