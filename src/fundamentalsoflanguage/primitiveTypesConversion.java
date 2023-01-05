package fundamentalsoflanguage;

/**
 * Calculates the total weight of a group of loads.
 */
public class primitiveTypesConversion {

    /**
     * Calculates the total weight of a group of loads.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        final double weightOfLoad1 = 1033.49;
        final double weightOfLoad2 = 849.88;

        int totalWeightOfLoads = (int) (weightOfLoad1 + weightOfLoad2);

        System.out.println("Total weight of loads " + totalWeightOfLoads);
    }
}
