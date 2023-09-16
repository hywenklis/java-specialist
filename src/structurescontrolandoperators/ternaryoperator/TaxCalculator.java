package structurescontrolandoperators.ternaryoperator;

public class TaxCalculator {

    public static void main(String[] args) {
        char invoiceType = 'P';
        double totalRevenue = 1200.30;

        /*
        double taxValue;

        if (invoiceType == 'S') {
            taxValue = totalRevenue * 0.16;
        } else {
            taxValue = totalRevenue * 0.35;
        }
        */

        // double taxValue = invoiceType == 'S' ? totalRevenue * 0.16 : totalRevenue * 0.35;

        double taxRate = invoiceType == 'S' ? 0.16 : 0.35;
        double taxValue = totalRevenue * taxRate;

        System.out.printf("Total revenue: $%.2f%n", totalRevenue);
        System.out.printf("Tax value: $%.2f%n", taxValue);
    }
}

