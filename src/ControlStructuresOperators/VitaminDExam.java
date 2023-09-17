package ControlStructuresOperators;

import java.util.Scanner;

public class VitaminDExam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Grupo de risco: ");
        boolean riskGroup = input.nextBoolean();

        System.out.print("Vitamina D: ");
        double vitaminD = input.nextDouble(); // nanogramas por mililitro

        boolean normalVitaminD = (!riskGroup && vitaminD > 20) || (riskGroup && vitaminD >= 30 && vitaminD <= 60);

        System.out.printf("Vitamina D normal: %b%n", normalVitaminD);
    }

}

