package ControlStructuresOperators.calculateIMC.strategy.impl;

import ControlStructuresOperators.calculateIMC.strategy.IMCCategoryStrategy;

public class AboveIdealWeightCategoryStrategyImpl implements IMCCategoryStrategy {

    private static final String ABOVE_IDEAL_WEIGHT_CATEGORY = "Acima do peso ideal.";
    private final double littleOverWeight;
    private final double aboveIdealWeight;

    public AboveIdealWeightCategoryStrategyImpl(double littleOverWeight, double aboveIdealWeight) {
        this.littleOverWeight = littleOverWeight;
        this.aboveIdealWeight = aboveIdealWeight;
    }

    public String getCategory(double imc) {
        if (imc > littleOverWeight && imc <= aboveIdealWeight) {
            return ABOVE_IDEAL_WEIGHT_CATEGORY;
        }
        return null;
    }
}
