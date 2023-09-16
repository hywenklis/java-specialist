package structurescontrolandoperators.challenge;

import java.util.Scanner;

public class LoanSimulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of installments: ");
        int numberOfInstallments = input.nextInt();

        double interestRate = switch (numberOfInstallments) {
            case 1, 2 -> 1.99;
            case 3 -> 2.99;
            default -> 3.99;
        };

        double fixedFee = loanAmount >= 100 ? loanAmount + 1.50 : 0;
        double totalInterest = loanAmount * (interestRate / 100 * numberOfInstallments);
        double totalCost = loanAmount + fixedFee + totalInterest;

        System.out.printf("Fixed fee: $%.2f%n", fixedFee);
        System.out.printf("Total interest: $%.2f%n", totalInterest);
        System.out.printf("Total cost: $%.2f%n", totalCost);
    }
}

