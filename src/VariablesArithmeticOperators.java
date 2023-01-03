public class VariablesArithmeticOperators {
    private static final double SALES_QUANTITIES = 3;

    public static void main(String[] args) {
        final double sale1 = 20;
        final double sale2 = 30;
        final double sale3 = 100;

        final double total = sale1 + sale2 + sale3;

        final double media = total / SALES_QUANTITIES;

        System.out.println(media);
    }
}
