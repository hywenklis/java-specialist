package StructuresControlAndOperators.BreakStatemen;

import java.util.Scanner;

public class CustomerServiceEvaluation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Rate our service (1 to 5): ");
        int rating = input.nextInt();

        String ratingDescription;

        switch (rating) {
            case 1:
                ratingDescription = "Very poor";
                System.out.println(1);
                break;
            case 2:
                ratingDescription = "Poor";
                System.out.println(2);
                break;
            case 3:
                ratingDescription = "Fair";
                System.out.println(3);
                break;
            case 4:
                ratingDescription = "Very good";
                System.out.println(4);
                break;
            case 5:
                ratingDescription = "Excellent";
                System.out.println(5);
                break;
            default:
                ratingDescription = "Invalid option";
                System.out.println("default");
                break;
        }

        System.out.printf("Your rating was: %d - %s%n", rating, ratingDescription);
    }
}
