package StructuresControlAndOperators.Challenge;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result = 0;

        while (result < 100) {
            System.out.println("Digite um número inteiro: ");
            int number = input.nextInt();

            result += number;
        }

        System.out.println("O resultado dos números é igual ou superior a 100!");
    }
}
