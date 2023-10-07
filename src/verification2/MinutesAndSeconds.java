package verification2;

import java.util.Scanner;

public class MinutesAndSeconds {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int minutes = Integer.parseInt(scanner.nextLine());
         int hours = Integer.parseInt(scanner.nextLine());
        System.out.printf("%2d:%02d",hours,minutes);
        /*спортни състезатели финишират за някакъв брой секунди (между 1 и 50). Да се напише програма, която чете времената на състезателите в се
        кунди, въведени от потребителя и пресмята сумарното им време във формат ("мин" +
                "ути:секунди"). Сек*/
    }
}
