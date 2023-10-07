package testCorrect;

import java.util.Scanner;

public class Workout05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double distanceFirstDayKm = Double.parseDouble(scanner.nextLine());
        double sumDistance = distanceFirstDayKm;
        double dayDistance = distanceFirstDayKm;

        for (int i = 0; i < days; i++) {
            int percentIncrease = Integer.parseInt(scanner.nextLine());
            sumDistance += dayDistance * ((1.0 * percentIncrease / 100) + 1);
            dayDistance = dayDistance + dayDistance * 1.0 * percentIncrease / 100;

        }
        if(sumDistance < 1000) {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",
                    Math.ceil(1000 - sumDistance));
        }else {
            System.out.printf("You've done a great job running %.0f more kilometers!",Math.ceil(sumDistance - 1000));
        }
    }
}
