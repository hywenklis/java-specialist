package FundamentalsOfLanguage;

import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String name = scanner.nextLine();

        System.out.println("Taxa horária: ");
        double hourlyRate = scanner.nextDouble();

        System.out.println("Horas trabalhadas: ");
        int hoursWorked = scanner.nextInt();

        System.out.println("Valor do desconto: ");
        double discountAmount = scanner.nextDouble();

        double totalWages = hourlyRate * hoursWorked;
        double totalDue = totalWages - discountAmount;

        System.out.println("----------------------------------");

        System.out.printf("%nFolha de pagamento: %s%n", name);
        System.out.printf("%d Horas x $%.2f = $%.2f%n", hoursWorked, hourlyRate, totalWages);
        System.out.printf("Discontos: $%.2f%n", discountAmount);
        System.out.printf("Total devido: $%.2f%n", totalDue);
    }
}

