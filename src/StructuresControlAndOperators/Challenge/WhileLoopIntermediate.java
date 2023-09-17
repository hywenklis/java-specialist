package StructuresControlAndOperators.Challenge;

import java.util.Scanner;

public class WhileLoopIntermediate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int number = input.nextInt();
        int invertedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            invertedNumber = invertedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Números com dígitos invertidos: " + invertedNumber);
    }
}

