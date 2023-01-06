package controlstructuresoperators;

import java.util.Scanner;

public class VitaminDExam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Risk group: ");
        boolean riskGroup = input.nextBoolean();

        System.out.print("Vitamin D: ");
        double vitaminD = input.nextDouble(); // nanograms per milliliter

        boolean normalVitaminD = (!riskGroup && vitaminD > 20) || (riskGroup && vitaminD >= 30 && vitaminD <= 60);

        System.out.printf("Normal vitamin D: %b%n", normalVitaminD);
    }

}

