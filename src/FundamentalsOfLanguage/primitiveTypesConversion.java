package FundamentalsOfLanguage;

public class primitiveTypesConversion {

    public static void main(String[] args) {
        final double weightOfLoad1 = 1033.49;
        final double weightOfLoad2 = 849.88;

        int totalWeightOfLoads = (int) (weightOfLoad1 + weightOfLoad2);

        System.out.println("Peso total das cargas: " + totalWeightOfLoads);
    }
}
