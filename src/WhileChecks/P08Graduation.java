package WhileChecks;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int poorGradeCount = 0;
        double sumGrades = 0;
        int year = 1;
        while (year <= 12) {
            if (poorGradeCount > 1) {
                break;
            }

            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade < 4) {
                poorGradeCount++;
                continue;
            }

            sumGrades = sumGrades + currentGrade;
            year++;
        }

        if (poorGradeCount > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double avgGrade = sumGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f%n", name, avgGrade);
        }
    }
}
