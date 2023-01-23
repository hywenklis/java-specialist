package controlstructuresoperators.calculateIMC.utils;

import java.util.HashMap;
import java.util.Map;

public class GenreCategory {
    public static final Map<String, Double> IMC_WEIGHT_MAP = new HashMap<>();
    static {
        IMC_WEIGHT_MAP.put("M_UNDER_WEIGHT", 20.7);
        IMC_WEIGHT_MAP.put("F_UNDER_WEIGHT", 19.1);
        IMC_WEIGHT_MAP.put("M_IDEAL_WEIGHT", 26.4);
        IMC_WEIGHT_MAP.put("F_IDEAL_WEIGHT", 25.8);
        IMC_WEIGHT_MAP.put("M_LITTLE_OVERWEIGHT", 27.8);
        IMC_WEIGHT_MAP.put("F_LITTLE_OVERWEIGHT", 27.3);
        IMC_WEIGHT_MAP.put("M_ABOVE_IDEAL_WEIGHT", 31.1);
        IMC_WEIGHT_MAP.put("F_ABOVE_IDEAL_WEIGHT", 32.3);
    }
}
