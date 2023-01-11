package controlstructuresoperators;

public class ComparisonOperators {

    public static void main(String[] args) {
        final int weightOfProducts = 900;
        final int truckWeightLimit = 1000;

        final boolean isLoadExceeded = weightOfProducts > truckWeightLimit;
        System.out.printf("Carga excedida: %b%n", isLoadExceeded);

        final boolean isLoadAllowed = truckWeightLimit >= weightOfProducts;
        System.out.printf("Carga permitida: %b%n", isLoadAllowed);
    }

}
