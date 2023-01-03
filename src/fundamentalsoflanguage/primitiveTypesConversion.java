package fundamentalsoflanguage;

public class primitiveTypesConversion {

    public static void main(String[] args) {
        final double weightCharge1 = 1033.49;
        final double weightCharge2 = 849.88;

        int weightTotalCharge = (int) (weightCharge1 + weightCharge2);

        System.out.println("Total weight of loads " + weightTotalCharge);
    }
}
