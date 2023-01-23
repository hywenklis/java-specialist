package controlstructuresoperators;

import java.util.Scanner;

public class EvaluationService {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Avalie o nosso atendimento (1 a 5): ");
        int note = scanner.nextInt();
        String noteDescription;

        switch (note) {
            case 1 -> noteDescription = "Muito ruim";
            case 2 -> noteDescription = "Ruim";
            case 3 -> noteDescription = "Razoável";
            case 4 -> noteDescription = "Muito bom";
            case 5 -> noteDescription = "Excelente";
            default -> noteDescription = "Opção inválida";
        }

        System.out.println(noteDescription);
    }
}
