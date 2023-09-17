package structurescontrolandoperators.forloop;

import java.util.Scanner;

public class AircraftWeightControl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Maximum aircraft weight: ");
        int maxWeight = input.nextInt();

        System.out.print("Number of passengers: ");
        int totalPassengers = input.nextInt();

        int totalPassengersWeight = 0;

        for (int currentPassenger = 1; currentPassenger <= totalPassengers; currentPassenger++) {
            System.out.printf("Weight of passenger #%d: ", currentPassenger);
            int passengerWeight = input.nextInt();

            totalPassengersWeight += passengerWeight;
        }

        System.out.printf("Maximum aircraft weight: %d kg%n", maxWeight);
        System.out.printf("Total passengers weight: %d kg%n", totalPassengersWeight);
        System.out.printf("Aircraft status: %s%n",
                totalPassengersWeight > maxWeight ? "weight exceeded" : "cleared");
    }
}
