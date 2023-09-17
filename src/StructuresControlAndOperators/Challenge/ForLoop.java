package StructuresControlAndOperators.Challenge;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter 10 even numbers: ");
            int number = input.nextInt();

            if (number % 2 == 1) {
                System.out.println("You cannot enter odd numbers, please try again...");
                continue;
            }
            result += number;
        }

        System.out.printf("Sum of the entered numbers: %d", result);
    }
}

