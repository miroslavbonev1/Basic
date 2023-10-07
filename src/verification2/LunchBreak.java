package verification2;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String tvShowName = scanner.nextLine();
         int duration = Integer.parseInt(scanner.nextLine());
         int lunchBreak = Integer.parseInt(scanner.nextLine());
         double timeForLunch = lunchBreak / 8.0;
         double timeToWatch = lunchBreak / 4.0;
         double spareTime = lunchBreak - timeForLunch - timeToWatch;
         if (spareTime >= duration) {
             System.out.printf("You have enough time to watch %s and left" +
                     " with %.0f minutes free time.", tvShowName, Math.ceil(spareTime - duration));
         }else{
             System.out.printf("You don't have enough time to watch %s, " +
                     "you need %.0f more minutes.",tvShowName,Math.ceil(duration - spareTime));
         }
    }
}
