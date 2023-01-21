package fundamentalsoflanguage.calculateIMC.strategy.impl;

import fundamentalsoflanguage.calculateIMC.strategy.IMCCategoryStrategy;

public class ObesityCategoryStrategyImpl implements IMCCategoryStrategy {

    private static final String OBESITY_CATEGORY = "Obeso.";
    private final double aboveIdealWeight;

    public ObesityCategoryStrategyImpl(double aboveIdealWeight) {
        this.aboveIdealWeight = aboveIdealWeight;
    }

    @Override
    public String getCategory(double imc) {
        if (imc > aboveIdealWeight) {
            return OBESITY_CATEGORY;
        }
        return null;
    }
}
