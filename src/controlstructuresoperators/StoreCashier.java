package controlstructuresoperators;

import java.util.Scanner;

public class StoreCashier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Preço dos produtos: ");
        double priceProduct = scanner.nextDouble();

        System.out.println("Cobrar frete? ");
        boolean chargeShipping = scanner.nextBoolean();

        double valueShipping = 0;

        if (chargeShipping) {
            System.out.println("Valor do frete: ");
            valueShipping = scanner.nextDouble();
        }

        double valueTotal = priceProduct + valueShipping;
        System.out.printf("Valor total: R$%.2f%n", valueTotal);
    }
}
