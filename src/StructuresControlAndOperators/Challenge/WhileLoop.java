package StructuresControlAndOperators.Challenge;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result = 0;

        while (result < 100) {
            System.out.println("Enter an integer: ");
            int number = input.nextInt();

            result += number;
        }

        System.out.println("The result of the numbers is equal to or greater than 100!");
    }
}

