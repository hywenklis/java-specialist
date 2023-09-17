package structurescontrolandoperators.whileloop;

import java.util.Scanner;

public class AircraftWeightControl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Maximum aircraft weight: ");
        int maxWeight = input.nextInt();

        int totalPassengersWeight = 0;
        boolean addNewPassenger = true;

        // while (true) {
        while (totalPassengersWeight <= maxWeight && addNewPassenger) {
            System.out.print("Passenger's weight: ");
            int passengerWeight = input.nextInt();

            totalPassengersWeight += passengerWeight;

            System.out.print("Add a new passenger? ");
            addNewPassenger = input.nextBoolean();
        }

        System.out.printf("Maximum aircraft weight: %d kg%n", maxWeight);
        System.out.printf("Total passengers' weight: %d kg%n", totalPassengersWeight);
        System.out.printf("Aircraft status: %s%n",
                totalPassengersWeight > maxWeight ? "weight exceeded" : "cleared");
    }
}

