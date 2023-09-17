package StructuresControlAndOperators.Challenge;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        boolean continueInput = true;

        do {
            System.out.print("Enter an integer (or enter 0 to stop): ");
            int number = input.nextInt();

            if (number == 0) {
                continueInput = false;
            } else if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }

        } while (continueInput);

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
