package ForLoopsExercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabsOpened = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= tabsOpened; i++) {
            String nameOfWebsite = scanner.nextLine();
            if (nameOfWebsite.equals("Facebook")) {
                salary -= 150;
            } else if (nameOfWebsite.equals("Instagram")) {
                salary -= 100;
            } else if (nameOfWebsite.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }if (salary > 0) {
            System.out.printf("%d", salary);
        }
    }
}
