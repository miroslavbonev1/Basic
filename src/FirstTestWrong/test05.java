package FirstTestWrong;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int metresTotal = 5364;
        int days = 0;
        while (!input.equals("END")) {
            for (int i = 1; i <= 5; i++) {
                int metres = Integer.parseInt(scanner.nextLine());
                days++;
                if (days >= 5) {
                     System.out.printf("Failed!%n %d", metresTotal);
                     break;
                 }
                else if (metresTotal >= 8848) {
                     System.out.printf("Goal reached for %d days!", days);
                     break;
                 }   metresTotal += metres;
                 input = scanner.nextLine();
                 if (input.equals("Yes")) {
                     continue;
                 }
             }
        }
        if (input.equals("END")) {
            System.out.printf("Failed!%n %d", metresTotal);
        }
    }
}
