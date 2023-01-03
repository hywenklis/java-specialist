package fundamentalsoflanguage;

import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Value per hour: ");
        double valueHour = scanner.nextDouble();

        System.out.println("Worked hours: ");
        int workedHours = scanner.nextInt();

        System.out.println("Value of discounts: ");
        double valueDiscounts = scanner.nextDouble();

        double valueTotalWorked = valueHour * workedHours;
        double valueTotalDue = valueTotalWorked - valueDiscounts;

        System.out.println("----------------------------------");

        System.out.printf("%nFolha de pagamento: %s%n", name);
        System.out.printf("%d horas x R$%.2f = R$%.2f%n", workedHours, valueHour, valueTotalWorked);
        System.out.printf("Descontos: R$%.2f%n", valueDiscounts);
        System.out.printf("Total devido: R$%.2f%n", valueTotalDue);
    }
}
