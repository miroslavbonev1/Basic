package MoreDifficultCheks;

import java.util.Scanner;

public class TICEKTS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();
        int price = 0;

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) {
            price = 12;

        } else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
            price = 14;
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            price = 16;
        }


        price = switch (dayOfWeek) {
            case "Monday", "Tuesday", "Friday" -> 12;
            case "Wednesday", "Thursday" -> 14;
            case "Saturday", "Sunday" -> 16;
            default -> price;
        };
    }
}

