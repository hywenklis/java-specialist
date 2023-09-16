package structurescontrolandoperators.switchexpressions;

import java.util.Scanner;

public class OperatingHours {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Day of the week (e.g., Mon, Tue, Wed, etc): ");
        String dayOfWeek = input.nextLine();

        System.out.print("Month: ");
        int month = input.nextInt();

        System.out.printf("Operating hours: %s%n", switch (dayOfWeek) {
            case "Mon" -> {
                if (month == 12) {
                    yield "08:00 AM - 04:00 PM";
                }
                yield "Closed";
            }
            case "Tue", "Wed", "Thu", "Fri" -> "08:00 AM - 06:00 PM";
            case "Sat", "Sun" -> "08:00 AM - 12:00 PM";
            default -> "Invalid day";
        });
    }
}
