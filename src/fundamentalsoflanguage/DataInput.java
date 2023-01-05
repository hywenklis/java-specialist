package fundamentalsoflanguage;

import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.println("Hours worked: ");
        int hoursWorked = scanner.nextInt();

        System.out.println("Discount amount: ");
        double discountAmount = scanner.nextDouble();

        double totalWages = hourlyRate * hoursWorked;
        double totalDue = totalWages - discountAmount;

        System.out.println("----------------------------------");

        System.out.printf("%nPayroll: %s%n", name);
        System.out.printf("%d hours x $%.2f = $%.2f%n", hoursWorked, hourlyRate, totalWages);
        System.out.printf("Discounts: $%.2f%n", discountAmount);
        System.out.printf("Total due: $%.2f%n", totalDue);
    }
}

