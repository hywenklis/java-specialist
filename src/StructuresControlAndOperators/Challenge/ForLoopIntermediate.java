package StructuresControlAndOperators.Challenge;

import java.util.Scanner;

public class ForLoopIntermediate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int number = input.nextInt();

        if (number <=1 ) {
            System.out.printf("O número: %d não é um número primo", number);
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.printf("O número: %d é um número primo", number);
            } else {
                System.out.printf("O número: %d não é um número primo", number);
            }
        }
    }
}

