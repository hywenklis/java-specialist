package structurescontrolandoperators.breakstatemen;

import java.util.Scanner;

public class OperatingHours {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Enter a day of the week (e.g., Mon, Tue, Wed, etc): ");
        String dayOfWeek = entrada.nextLine();
        String operatingHours;

        switch (dayOfWeek) {
            case "Mon":
                operatingHours = "Closed";
                break;
            case "Tue":
            case "Wed":
            case "Thu":
            case "Fri":
                operatingHours = "08:00 AM - 06:00 PM";
                break;
            case "Sat":
            case "Sun":
                operatingHours = "08:00 AM - 12:00 PM";
                break;
            default:
                operatingHours = "Invalid day";
        }

        System.out.printf("Operating hours: %s%n", operatingHours);
    }
}
