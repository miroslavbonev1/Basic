package ForLoopsExercise;

import java.util.Scanner;

public class P07Tracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Група до 5 човека – изкачват Мусала
        //• Група от 6 до 12 човека – изкачват Монблан
        //• Група от 13 до 25 човека – изкачват Килиманджаро
        //• Група от 26 до 40 човека – изкачват К2
        //• Група от 41 или повече човека – изкачват Еверест
        int numberOfGroups = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;
        double percentage = 0;
        for (int i = 1; i <= numberOfGroups; i++) {
            double numberOfPeople = Double.parseDouble(scanner.nextLine());
            totalPeople += numberOfPeople;

            if (numberOfPeople < 5) {
                System.out.printf("Musala %.2f%%", numberOfPeople / totalPeople * 100);
            } else if (numberOfPeople < 12) {
                System.out.printf("Montblank %.2f%%", numberOfPeople / totalPeople * 100);
            } else if (numberOfPeople < 25) {
                System.out.printf("Kilimanjaro %.2f%%", numberOfPeople / totalPeople * 100);
            } else if (numberOfPeople < 40) {
                System.out.printf("K2 %.2f%%", numberOfPeople / totalPeople * 100);
            } else if (numberOfPeople > 41) {
                System.out.printf(" Everest %.2f%%", numberOfPeople / totalPeople * 100);
            }
        }
    }
}