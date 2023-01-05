package controlstructuresoperators;

import java.util.Scanner;

public class CortisolExam {

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.print("Cortisol: ");
        final double cortisol = input.nextDouble();

        final boolean isCortisolNormal = cortisol >= 6.0 && cortisol <= 18.4;
        System.out.printf("Cortisol normal: %b%n", isCortisolNormal);

        final boolean isCortisolAbnormal = cortisol < 6.0 || cortisol > 18.4;
        System.out.printf("Cortisol abnormal: %b%n", isCortisolAbnormal);
    }

}

