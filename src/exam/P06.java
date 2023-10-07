package exam;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locationsNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= locationsNumber; i++) {
             double goldTotal = 0;
             double expectedGoldAverage = Double.parseDouble(scanner.nextLine());
             int daysWorking = Integer.parseInt(scanner.nextLine());
              for (int j = 1; j <= daysWorking; j++) {
                  double goldCurrentDay = Double.parseDouble(scanner.nextLine());
                  goldTotal += goldCurrentDay;
              }
            double goldAverage = goldTotal / daysWorking;
            if (goldAverage >= expectedGoldAverage){
                System.out.printf("Good job! Average gold per day: %.2f.%n",goldAverage);
            } else if (goldAverage<expectedGoldAverage) {
                System.out.printf("You need %.2f gold.%n",Math.abs(expectedGoldAverage - goldAverage));
            }
        }
    }
}
