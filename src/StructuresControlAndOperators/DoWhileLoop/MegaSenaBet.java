package StructuresControlAndOperators.DoWhileLoop;

import java.util.Scanner;

public class MegaSenaBet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberQuantity = 0;

        do {
            System.out.print("Number of numbers: ");
            numberQuantity = input.nextInt();

            if (numberQuantity < 6 || numberQuantity > 15) {
                System.out.println("Number of numbers should be between 6 and 15.");
            }
        } while (numberQuantity < 6 || numberQuantity > 15);

        int currentNumber = 1;
        String chosenNumbers = "";

        do {
            System.out.printf("Number %d/%d: ", currentNumber, numberQuantity);
            int chosenNumber = input.nextInt();

            if (chosenNumber < 1 || chosenNumber > 60) {
                System.out.println("Number should be between 1 and 60.");
            } else {
                chosenNumbers += chosenNumber + " ";
                currentNumber++;
            }
        } while (currentNumber <= numberQuantity);

        System.out.printf("Chosen numbers: %s%n", chosenNumbers);
    }

}

