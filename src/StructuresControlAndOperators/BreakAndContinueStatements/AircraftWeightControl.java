package StructuresControlAndOperators.BreakAndContinueStatements;

import java.util.Scanner;

public class AircraftWeightControl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Maximum aircraft weight: ");
        int maxWeight = input.nextInt();

        int totalPassengersWeight = 0;

        while (true) {
            System.out.print("Passenger's weight: ");
            int passengerWeight = input.nextInt();

            if (totalPassengersWeight + passengerWeight > maxWeight) {
                System.out.println("Could not add passenger. Weight would exceed the maximum.");
                continue;
            }

            totalPassengersWeight += passengerWeight;

            System.out.print("Add a new passenger? ");
            if (!input.nextBoolean()) {
                break;
            }
        }

        System.out.printf("Maximum aircraft weight: %d kg%n", maxWeight);
        System.out.printf("Total passengers' weight: %d kg%n", totalPassengersWeight);
        System.out.printf("Aircraft status: %s%n",
                totalPassengersWeight > maxWeight ? "weight exceeded" : "cleared");
    }
}

