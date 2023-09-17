package ControlStructuresOperators;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " é um ano bissexto.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " é um ano bissexto.");
        } else {
            System.out.println(year + " não é um ano bissexto.");
        }
    }
}
