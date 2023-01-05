package fundamentalsoflanguage;

/**
 * Calculates the average sales of a group of products.
 */
public class VariablesArithmeticOperators {

    /** The number of products sold. */
    private static final double NUMBER_OF_PRODUCTS_SOLD = 3;

    /**
     * Calculates the average sales of a group of products.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        final double saleProduct1 = 20;
        final double saleProduct2 = 30;
        final double saleProduct3 = 100;

        final double total = saleProduct1 + saleProduct2 + saleProduct3;

        final double media = total / NUMBER_OF_PRODUCTS_SOLD;

        System.out.println(media);
    }
}
